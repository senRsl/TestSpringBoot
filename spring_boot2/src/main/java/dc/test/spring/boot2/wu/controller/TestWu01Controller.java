package dc.test.spring.boot2.wu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.test.spring.boot2.wu.component.TestWu01Properties;


/**
 * @author senrsl
 * @ClassName: TestWu01Controller
 * @Package: dc.test.spring.boot2.wu.controller
 * @CreateTime: 2020/10/14 2:56 下午
 */
@RestController
public class TestWu01Controller {

    //方式1，直接读取application.properties
    @Value("${sb2.title}")
    private String sb2Title;

    //方式2，依赖注入环境配置
    @Autowired
    private Environment env;

    //用这个，可以直接取application.properties内bean prop.
    @Autowired
    TestWu01Properties properties;

    @RequestMapping("wu")
    public String wu() {

        System.out.printf(properties.toString());
        return String.format("%s\t%s\n<br/>%s\t%s\t%s",
                sb2Title, env.getProperty("sb2.title"),
                getClass().getSimpleName(), properties.getTitle(), properties.getDesc());
    }

}
