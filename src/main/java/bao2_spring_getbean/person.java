package bao2_spring_getbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Title person
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 15:39
 */
@Component
public class person {
    @Autowired
    private car c;

    public void test()
    {
        System.out.println("person book...");
        c.test();
    }

    @Override
    public String toString() {
        return "person{" +
                "c=" + c +
                '}';
    }
}
