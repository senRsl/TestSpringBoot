package dc.test.spring.boot2.wang.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dc.test.spring.boot2.wang.domain.WangUser;

/**
 * @author senrsl
 * @ClassName: IWangUserRepository
 * @Package: dc.test.spring.boot2.wang.dao
 * @CreateTime: 2020/10/30 3:49 下午
 */
public interface IWangUserRepository extends JpaRepository<WangUser, Long> {

    WangUser findByName(String name);

    WangUser findByNameOrEmail(String name, String email);
}
