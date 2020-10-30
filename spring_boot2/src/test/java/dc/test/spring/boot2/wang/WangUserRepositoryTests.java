package dc.test.spring.boot2.wang;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dc.test.spring.boot2.wang.domain.WangUser;
import dc.test.spring.boot2.wang.repo.IWangUserRepository;

/**
 * @author senrsl
 * @ClassName: WangUserRepositoryTests
 * @Package: dc.test.spring.boot2.wang
 * @CreateTime: 2020/10/30 3:56 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WangUserRepositoryTests {

    @Autowired
    private IWangUserRepository repository;

    @Test
    public void testCount() {
        long totalSize = repository.count();

        Assert.assertEquals(17, totalSize);
    }

    @Test
    public void testSelect() {
        WangUser usr = repository.findByNameOrEmail("wang100", "wang100@a.com");

        Assert.assertEquals("a", usr.getPasswd());
    }

}
