package dc.test.spring.boot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author senrsl
 * @ClassName: TestWebService01Application
 * @Package: dc.test.spring.boot2
 * @CreateTime: 2020/9/27 4:03 下午
 */
@SpringBootApplication
@ServletComponentScan
public class TestWebService01Application /*extends SpringBootServletInitializer */ {


    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //return super.configure(builder);
        return builder.sources(TestWebService01Application.class);
    }*/

//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new Test01HttpServlet(), "/test/*");
//    }

    public static void main(String[] args) {
        SpringApplication.run(TestWebService01Application.class, args);
    }


}
