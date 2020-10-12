package dc.test.spring.boot2.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口3，实现 直接访问controller
 *
 * @author senrsl
 * @ClassName: TestSunApplication
 * @Package: dc.test.spring.boot2.sun
 * @CreateTime: 2020/10/12 3:25 下午
 */
@SpringBootApplication
public class TestSunApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSunApplication.class, args);
    }

}
