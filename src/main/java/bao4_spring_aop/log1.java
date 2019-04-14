package bao4_spring_aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @Title log1
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 17:37
 */
public class log1 {
    public void before(JoinPoint JoinPoint)
    {
        System.out.println();
        String name=JoinPoint.getSignature().getName();
        Object args[]=JoinPoint.getArgs();
        System.out.println("前置method:"+name+" begin with"+Arrays.asList(args));
    }
    public void afterreturning(JoinPoint JoinPoint,Object result)
    {
        String name=JoinPoint.getSignature().getName();
        System.out.println("返回method:"+name+" result:"+result);
    }
    public void after(JoinPoint JoinPoint)
    {
        String name=JoinPoint.getSignature().getName();
        System.out.println("后置method:"+name+" end");
    }
    public void afterthrowing(JoinPoint JoinPoint,Exception e)
    {
        String name=JoinPoint.getSignature().getName();
        System.out.println("异常method: "+name+" "+e);
    }
}
