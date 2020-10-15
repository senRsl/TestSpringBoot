package dc.test.spring.boot2.wu.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author senrsl
 * @ClassName: TestWuOwnerProperties
 * @Package: dc.test.spring.boot2.wu.component
 * @CreateTime: 2020/10/15 11:28 上午
 */
@Component
@ConfigurationProperties(prefix = "wu.own")
@PropertySource(value = {"wu.properties"})
public class TestWuOwnerProperties {

    //类注解前缀加变量名组合成prop文件中name
    private String title;
    private String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
