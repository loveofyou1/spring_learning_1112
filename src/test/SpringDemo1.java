package test;

import cn.muke.spring.demo1.service.IAccoutService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 转账案例的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
    @Test
    public void demo1() {

        accoutService.transfer("aaa", "bbb", 200d);
    }

    @Resource(name = "accountService")
    private IAccoutService accoutService;

}
