package dc.test.spring.boot2.wu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.test.spring.boot2.wu.component.TestWuOwnerProperties;

/**
 * http://localhost:8080/wu2
 * TestWuOwnController Wu's own title Wu's own desc
 *
 * @author senrsl
 * @ClassName: TestWuOwnController
 * @Package: dc.test.spring.boot2.wu.controller
 * @CreateTime: 2020/10/15 11:34 上午
 */
@RestController
public class TestWuOwnController {


    //@Autowired Field injection is not recommended
    private final TestWuOwnerProperties prop;

    public TestWuOwnController(TestWuOwnerProperties prop) {
        this.prop = prop;
    }

    @RequestMapping("wu2")
    public String callOwn() {
        return String.format("%s\t%s\t%s\t", getClass().getSimpleName(), prop.getTitle(), prop.getDesc());
    }

}
