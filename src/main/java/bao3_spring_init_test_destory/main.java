package bao3_spring_init_test_destory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title bao1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 16:33
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring3.xml");
        car c= (car) ctx.getBean("car");
        System.out.println(c);
        c.test();
        car cc= (car) ctx.getBean("car");
        System.out.println(cc==c);
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
