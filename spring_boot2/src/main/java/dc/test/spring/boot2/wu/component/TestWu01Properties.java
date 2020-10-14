package dc.test.spring.boot2.wu.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author senrsl
 * @ClassName: WuProperties
 * @Package: dc.test.spring.boot2.wu.component
 * @CreateTime: 2020/10/14 2:54 下午
 */
@Component
public class TestWu01Properties {

    @Value("${sb2.title}")
    private String sb2Title;
    @Value("${dc.test.wu.title}")
    private String title;
    @Value("${dc.test.wu.desc}")
    private String desc;

    public String getSb2Title() {
        return sb2Title;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TestWu01Properties{" +
                "sb2Title='" + sb2Title + '\'' +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
