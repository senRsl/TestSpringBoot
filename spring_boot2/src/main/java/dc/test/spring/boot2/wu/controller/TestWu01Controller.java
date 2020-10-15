package dc.test.spring.boot2.wu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.test.spring.boot2.wu.component.TestWu01Properties;


/**
 * http://localhost:8080/wu
 * Sb2 Sb2
 * TestWu01Controller Wu's Title Wu's Desc Sb2
 *
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

    //方式3，依赖注入component类，类变量直接取application.properties
    @Autowired
    TestWu01Properties properties;

    @RequestMapping("wu")
    public String wu() {

        System.out.printf(properties.toString());
        return String.format("%s\t%s\n<br/>%s\t%s\t%s\t%s",
                sb2Title, env.getProperty("sb2.title"),
                getClass().getSimpleName(), properties.getTitle(), properties.getDesc(), properties.getSb2Title());
    }

}
