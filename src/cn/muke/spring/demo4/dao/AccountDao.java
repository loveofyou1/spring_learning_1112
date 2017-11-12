package cn.muke.spring.demo4.dao;

/**
 * 转账dao层接口
 */
public interface AccountDao {

    public void outMoney(String out, Double money);

    public void inMoney(String in, Double money);
}
