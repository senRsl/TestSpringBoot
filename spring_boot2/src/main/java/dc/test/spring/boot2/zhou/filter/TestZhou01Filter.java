package dc.test.spring.boot2.zhou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * filter来自javax.servlet包
 *
 * @author senrsl
 * @ClassName: TestZhou01Filter
 * @Package: dc.test.spring.boot2.zhou.filter
 * @CreateTime: 2020/10/12 4:19 下午
 */
public class TestZhou01Filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(getClass().getSimpleName() + " init() " + filterConfig + "  " + filterConfig.getFilterName() + " " + filterConfig.getInitParameter("testInit01"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println(getClass().getSimpleName() + " doFilter() " + "request = " + request + ", response = " + response + ", chain = " + chain + ",requestUrl:" + req.getRequestURI());

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println(getClass().getSimpleName() + " destroy()");
    }
}
