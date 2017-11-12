package cn.muke.spring.demo1.service;

/**
 * 转账业务接口
 */

public interface IAccoutService {
    /**
     * 转账方法
     *
     * @param out   转出账户
     * @param in    转入账户
     * @param money 转账金额
     */
    public void transfer(String out, String in, Double money);
}
