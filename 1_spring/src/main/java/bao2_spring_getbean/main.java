package bao2_spring_getbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title bao1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 15:40
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring2.xml");
        person p=(person)ctx.getBean("person");
        System.out.println(p);
        p.test();
        car c= (car) ctx.getBean("car");
        System.out.println(c);
        c.test();
    }
}
