package dc.test.spring.boot2.zhou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author senrsl
 * @ClassName: TestZhouController
 * @Package: dc.test.spring.boot2.zhou.controller
 * @CreateTime: 2020/10/12 4:34 下午
 */
@RestController
public class TestZhouController {

    @RequestMapping("zhou")
    public String zhou() {
        return getClass().getSimpleName();
    }

    @RequestMapping("aaa/zhou")
    public String zhou01() {
        return getClass().getSimpleName();
    }

    @RequestMapping("zhou/bbb")
    public String zhou02() {
        return getClass().getSimpleName();
    }

}
