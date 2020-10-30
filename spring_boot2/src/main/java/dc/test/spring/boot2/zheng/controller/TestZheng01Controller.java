package dc.test.spring.boot2.zheng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日志输出测试
 * 输出于/Users/senrsl/j2ee/Project/TestSpringBoot/spring_boot2/log/spring.log
 *
 * @author senrsl
 * @ClassName: TestZheng01Controller
 * @Package: dc.test.spring.boot2.zheng.controller
 * @CreateTime: 2020/10/30 11:24 上午
 */
@RestController
public class TestZheng01Controller {

    public static final Logger log = LoggerFactory.getLogger(TestZheng01Controller.class);

    @RequestMapping("zheng")
    public String zheng() {
        log.trace("这是 trace 的测试。。。。");
        log.debug("这是 debug 的测试。。。。");
        log.info("这是 info 的测试。。。。");
        log.warn("这是 warn 的测试。。。。");
        log.error("这是 error 的测试。。。。");
        return getClass().getSimpleName();
    }

}
