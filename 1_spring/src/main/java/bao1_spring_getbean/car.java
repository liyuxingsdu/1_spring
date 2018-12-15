package bao1;

import java.util.List;

/**
 * @Title car
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\3 0003 11:24
 */
public class car {
    private List<bao1.person> people;
    private String name;

    public void setPeople(List<bao1.person> people) {
        this.people = people;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "car{" +
                "people=" + people +
                ", name='" + name + '\'' +
                '}';
    }
}
