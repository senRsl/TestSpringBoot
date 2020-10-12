package dc.test.spring.boot2.lee.domain;

/**
 * @author senrsl
 * @ClassName: LeeBean
 * @Package: dc.test.spring.boot2.lee.domain
 * @CreateTime: 2020/10/12 3:51 下午
 */
public class LeeBean {

    private long id;
    private String name;
    private int age;

    public LeeBean() {
    }

    public LeeBean(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
