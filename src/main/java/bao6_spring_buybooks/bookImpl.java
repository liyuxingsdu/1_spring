package bao6_spring_buybooks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @Title bookImpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 9:22
 */
@Component("book")
public class bookImpl implements book {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int getprice(int id) {
        String sql="select price from book where id=?";
        int k=jdbcTemplate.queryForObject(sql,Integer.class,id);
        return k;
    }

    @Override
    public void updatekucun(int id) {
       String sql="select kucun from shuliang where id=?";
       int k=jdbcTemplate.queryForObject(sql,Integer.class,id);
       if(k==0){
           throw new kucunyichang("库存不足");
       }
       sql="update shuliang set kucun=kucun-1 where id=?";
       jdbcTemplate.update(sql,id);
    }

    @Override
    public void updatemoney(String name, int price) {
        String sql="select money from person where name=?";
        int money=jdbcTemplate.queryForObject(sql,Integer.class,name);
        if(money<price){
            throw new yueyichang("余额不足");
        }
        sql="update person set money=money-? where name=?";
        jdbcTemplate.update(sql,price,name);
    }
}
