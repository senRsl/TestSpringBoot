package dc.test.spring.boot2.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/sun
 *
 * @author senrsl
 * @ClassName: Test01Controller
 * @Package: dc.test.spring.boot2.controller
 * @CreateTime: 2020/9/27 4:30 下午
 */
@RestController
public class TestSun01Controller {

    @RequestMapping("sun")
    public String sun() {
        return getClass().getSimpleName() + " from Sun";
    }

}
