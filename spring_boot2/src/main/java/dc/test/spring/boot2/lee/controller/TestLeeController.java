package dc.test.spring.boot2.lee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.test.spring.boot2.lee.domain.LeeBean;

/**
 * @author senrsl
 * @ClassName: TestLeeController
 * @Package: dc.test.spring.boot2.lee.controller
 * @CreateTime: 2020/10/12 3:51 下午
 */
@RestController
public class TestLeeController {

    @RequestMapping("getLeeBean")
    public LeeBean getLeeBean() {
        return new LeeBean(1L, "李啊", 100);
    }

}
