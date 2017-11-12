package cn.muke.spring.demo4.service;

import cn.muke.spring.demo4.dao.AccountDao;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 转账实现类
 */

/**
 * propagation:事务的传播途径
 * isolation  :事务隔离级别
 * readOnly   ：只读属性
 * rollbackFor:发生哪些异常回滚
 */
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements IAccoutService {

    private AccountDao accountDao;


    @Override
    public void transfer(final String out, final String in, final Double money) {

        //调用dao层代码
        accountDao.outMoney(out, money);
        //int i = 1/0;
        accountDao.inMoney(in, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
