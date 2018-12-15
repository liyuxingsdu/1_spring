package bao1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title bao1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 10:10
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring1.xml");
        bao1.person p= (bao1.person) ctx.getBean("person");
        System.out.println(p);
        p= (bao1.person) ctx.getBean("person0");
        System.out.println(p);
        p= (bao1.person) ctx.getBean("person2");
        System.out.println(p);
        p= (bao1.person) ctx.getBean("person3");
        System.out.println(p);
        bao1.car c= (bao1.car) ctx.getBean("car");
        System.out.println(c);

    }
}
