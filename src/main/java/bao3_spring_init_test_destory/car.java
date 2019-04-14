package bao3_spring_init_test_destory;

/**
 * @Title car
 * @Description
 * @Copyricarght: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 16:26
 */
public class car {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public car() {
        System.out.println("构造car...");
    }
    public void init()
    {
        System.out.println("init car...");
    }
    public void destroy()
    {
        System.out.println("destroy car...");
    }
    public void test()
    {
        System.out.println("car:"+name);
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                '}';
    }

}
