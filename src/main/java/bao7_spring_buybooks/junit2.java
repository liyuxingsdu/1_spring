package bao7_spring_buybooks;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title junit
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 10:14
 */
public class junit2 {

    private buy buy1;
    private book book1;
    private buy2 buy2;
    private ApplicationContext ctx;

    {
        ctx = new ClassPathXmlApplicationContext("spring7.xml");
        book1 = (book) ctx.getBean("book");
        buy1 = (buy) ctx.getBean("buy");
        buy2= (buy2) ctx.getBean("buy2");
    }

    @Test
    public void test1() {
        int k = book1.getprice(1001);
        System.out.println(k);
    }
    @Test
    public void test2()
    {
        book1.updatekucun(1001);
    }
    @Test
    public void test3()
    {
        book1.updatemoney("aa",90);
    }
    @Test
    public void test4()
    {
        buy1.purchase("aa",1001);
    }
    @Test
    public void test5()
    {
        int x[]={1000,1001,1002};
        buy2.purchase2("aa",x);
    }
}
