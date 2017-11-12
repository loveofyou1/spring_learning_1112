package test;

import cn.muke.spring.demo4.service.IAccoutService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事务管理方法二：基于AspectJ的xml的方式
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {

    @Resource(name = "accountService")
    private IAccoutService accoutService;

    @Test
    public void demo3() {
        accoutService.transfer("aaa", "bbb", 300d);
    }
}
