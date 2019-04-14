package bao4_spring_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title bao1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 17:50
 */
public class main {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring4.xml");
        aopinterface a= (aopinterface) ctx.getBean("aop");
        System.out.println(a.getClass().getName());
        a.add(1,2);
        a.sub(5,2);
        a.mul(3,2);
        a.div(8,2);
    }
}
