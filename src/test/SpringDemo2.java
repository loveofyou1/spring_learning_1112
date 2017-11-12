package test;

import cn.muke.spring.demo4.service.IAccoutService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 声明式事物管理测试类-方法一
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {

    /**
     * 注入代理类，因为代理类是增强过的代码
     */


    //@Resource(name = "accountService")
    @Resource(name = "acountServiceProxy")
    private IAccoutService accoutService;

    @Test
    public void Test() {

        accoutService.transfer("aaa", "bbb", 200d);
    }
}
