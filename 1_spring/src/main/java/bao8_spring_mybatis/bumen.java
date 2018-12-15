package bao8_spring_mybatis;

import java.io.Serializable;

/**
 * @Title bumen
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\10 0010 17:10
 */
public class bumen implements Serializable {
    private String name;
    private String bm;

    public bumen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBm() {
        return bm;
    }

    public void setBm(String bm) {
        this.bm = bm;
    }

    @Override
    public String toString() {
        return "bumen{" +
                "name='" + name + '\'' +
                ", bm='" + bm + '\'' +
                '}';
    }
}
