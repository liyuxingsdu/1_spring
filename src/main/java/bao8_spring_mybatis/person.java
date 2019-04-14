package bao8_spring_mybatis;

import java.io.Serializable;

/**
 * @Title person
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\7 0007 8:28
 */
public class person implements Serializable {
    private String name;
    private int money;
    private bumen bumen;
    public person() {
    }

    public bao8_spring_mybatis.bumen getBumen() {
        return bumen;
    }

    public void setBumen(bao8_spring_mybatis.bumen bumen) {
        this.bumen = bumen;
    }

    public person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", bumen=" + bumen +
                '}';
    }
}
