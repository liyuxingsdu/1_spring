package bao6_spring_buybooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title buy2Impl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 14:11
 */
@Component("buy2")
public class buy2Impl implements buy2 {
    @Autowired
    private  buy b;

//    事务设置
    @Transactional
    @Override
    public void purchase2(String name, int[] id) {
        for(int t:id)
        {
            b.purchase(name,t);
        }
        System.out.println("购买成功！");
    }
}
