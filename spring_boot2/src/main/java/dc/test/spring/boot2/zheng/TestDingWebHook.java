package dc.test.spring.boot2.zheng;

import java.net.URLEncoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

/**
 * @author senrsl
 * @ClassName: TestDingWebHook
 * @Package: dc.test.spring.boot2.zheng
 * @CreateTime: 2020/10/28 2:53 下午
 */
public class TestDingWebHook {


    public static void main(String[] args) throws Exception {
        String urlFormat = "https://oapi.dingtalk.com/robot/send?access_token=xxxx&timestamp=%s&sign=%s";

        Long timestamp = System.currentTimeMillis();
        String secret = "xxx";

        String stringToSign = timestamp + "\n" + secret;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");
        System.out.println(timestamp);
        System.out.println(sign);
        System.out.println(String.format(urlFormat, timestamp, sign));

        /*
        curl  'https://oapi.dingtalk.com/robot/send?access_token=xxx&timestamp=1603868768062&sign=WSSRnshFRrDWpTk6RNb5HLulM0YJZmcpujkFeVBn1EA%3D' \
        -H 'Content-Type: application/json' \
        -d '{"msgtype": "text","text": {"content": "我就是我, 是不一样的烟火"}}'
        */
    }

}
