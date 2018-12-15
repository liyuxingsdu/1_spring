package bao4_spring_aop;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Title aop
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 17:34
 */
@Component
@Order(0)//优先级
public class aop implements aopinterface{
    @Override
    public int add(int i, int j) {
        System.out.println("result:"+(i+j));
        return i+j;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("result:"+(i-j));
        return i-j;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("result:"+(i*j));
        return i*j;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("result:"+(i/j));
        return i/j;
    }
}
