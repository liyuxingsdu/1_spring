package bao4_spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Title log
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 17:37
 */

//  @Aspect定义切面
@Aspect
@Component
public class log {
    @Before("execution(* bao4.*.*(..))")
    public void before(JoinPoint JoinPoint)
    {
        System.out.println();
//        获取方法名称
        String name=JoinPoint.getSignature().getName();
//        获取参数
        Object args[]=JoinPoint.getArgs();
        System.out.println("method:"+name+" begin with"+Arrays.asList(args));
    }

    @After("execution(* bao4.*.*(..))")
    public void after(JoinPoint JoinPoint)
    {
        String name=JoinPoint.getSignature().getName();
        System.out.println("method:"+name+" end");
    }
}
