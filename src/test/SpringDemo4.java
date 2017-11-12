package test;

import cn.muke.spring.demo4.service.IAccoutService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 事务管理实现方式三：注解
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {

    @Resource(name = "accountService")
    private IAccoutService accoutService;

    @Test
    public void demo4() {
        accoutService.transfer("bbb", "aaa", 400d);
    }
}
