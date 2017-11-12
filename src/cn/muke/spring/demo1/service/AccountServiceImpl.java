package cn.muke.spring.demo1.service;

import cn.muke.spring.demo1.dao.AccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账实现类
 */
public class AccountServiceImpl implements IAccoutService {

    private AccountDao accountDao;

    //注入事物管理的模版
    private TransactionTemplate transactionTemplate;


    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer(final String out, final String in, final Double money) {

        //调用dao层代码
//        accountDao.outMoney(out, money);
//        accountDao.inMoney(in, money);
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                accountDao.outMoney(out, money);
                int i = 1 / 0;
                accountDao.inMoney(in, money);
            }
        });
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
