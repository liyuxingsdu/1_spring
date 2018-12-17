package bao2_spring_getbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Title car
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 15:38
 */
@Component
public class car {
    @Value("baoma")
    private String name;

    public void test()
    {
        System.out.println("car:"+name+" book...");
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                '}';
    }
}
