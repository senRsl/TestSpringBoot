package dc.test.spring.boot2.qian.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * http://localhost:8080/test01?name=aaaa
 *
 * @author senrsl
 * @ClassName: Test01HttpServlet
 * @Package: dc.test.spring.boot2.qian.servlet
 * @CreateTime: 2020/9/27 4:07 下午
 */
@WebServlet(urlPatterns = {"/test01"})
public class Test01HttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);   //不注释这个，会405
        String result = String.format("%s\t%s\t%s", getClass().getSimpleName(), req.getQueryString(), "welcome!!!");

        log(result);

//        resp.getWriter().append(result);

        String name = req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.println(result);
        writer.write(result);
        writer.write(name);
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }
}
