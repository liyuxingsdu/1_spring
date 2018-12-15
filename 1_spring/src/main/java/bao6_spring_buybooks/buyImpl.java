package bao6_spring_buybooks;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Title buyImpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 10:08
 */
@Component("buy")
public class buyImpl implements buy {
    @Resource
    private  book b;
//    事务设置
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,readOnly = false)
    @Override
    public void purchase(String name, int id) {
        int k=b.getprice(id);
        b.updatekucun(id);
        b.updatemoney(name,k);
    }
}
