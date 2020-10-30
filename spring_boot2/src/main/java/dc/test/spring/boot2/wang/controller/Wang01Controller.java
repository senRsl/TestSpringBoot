package dc.test.spring.boot2.wang.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.test.spring.boot2.wang.domain.WangUser;
import dc.test.spring.boot2.wang.repo.IWangUserRepository;

/**
 * @author senrsl
 * @ClassName: Wang01Controller
 * @Package: dc.test.spring.boot2.wang.controller
 * @CreateTime: 2020/10/30 4:08 下午
 */
@RequestMapping("wang/user/")
@RestController
public class Wang01Controller {

    @Autowired
    private IWangUserRepository repository;

    /**
     * http://localhost:8080/wang/user/add
     *
     * @return
     */
    @RequestMapping("add")
    public String wangUser() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
        Date date = new Date();

        WangUser usr = repository.save(new WangUser(generateName(), "a", generateEmail(), sdf.format(date)));

        System.out.println(usr.toString());

        return usr.toString();
    }

    int i = 100;

    private String generateName() {
        return "wang" + i;
    }

    private String generateEmail() {
        return "wang" + i++ + "@a.com";
    }

    /**
     * http://localhost:8080/wang/user/list
     *
     * @return
     */
    @RequestMapping("list")
    public String list() {
        List<WangUser> list = repository.findAll();
        StringBuffer sb = new StringBuffer();
        for (WangUser usr : list) {
            sb.append(usr.toString()).append("\n<br/>");
        }
        return sb.toString();
    }

    /**
     * http://localhost:8080/wang/user/delete/11
     *
     * @param id
     */
    @RequestMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }

    /**
     * http://localhost:8080/wang/user/update?id=18&name=aaaaaa
     * http://localhost:8080/wang/user/update?name=aaaaaa&id=180
     *
     * @param id
     * @param name
     * @return
     */
    @RequestMapping("update")
    public String update(long id, String name) {
        Optional<WangUser> usr = repository.findById(id);
        if (!usr.isPresent()) return usr.toString();
        usr.get().setName(name);
        WangUser usrNew = repository.save(usr.get());
        return usrNew.toString();
    }

}
