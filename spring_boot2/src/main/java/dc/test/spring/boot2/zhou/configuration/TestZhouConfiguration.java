package dc.test.spring.boot2.zhou.configuration;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dc.test.spring.boot2.zhou.filter.TestZhou01Filter;

/**
 * @author senrsl
 * @ClassName: TestZhouConfiguration
 * @Package: dc.test.spring.boot2.zhou.configuration
 * @CreateTime: 2020/10/12 4:28 下午
 */
@Configuration
public class TestZhouConfiguration {

    @Bean
    public RemoteIpFilter testRemoteIpFilter() {
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistrationBean() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new TestZhou01Filter());
        //bean.addUrlPatterns("/zhou");  //过滤路径,只过滤/zhou，不过滤aaa/zhou或zhou/bbb
        bean.addUrlPatterns("/zhou/*");
        bean.addInitParameter("testInit01", "aaaaaaaaaaa");//这里设置，filter中filterConfig能取到
        bean.setName(TestZhou01Filter.class.getSimpleName());
        bean.setOrder(1);   //排序
        return bean;
    }

}
