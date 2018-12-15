package bao7_spring_buybooks;

/**
 * @Title buyImpl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 10:08
 */
public class buyImpl implements buy {
    private book b;

    public void setB(book b) {
        this.b = b;
    }

    @Override
    public void purchase(String name, int id) {
        int k=b.getprice(id);
        b.updatekucun(id);
        b.updatemoney(name,k);
        System.out.print(b.getname(id)+"("+k+"元"+")"+"购买成功   ");
    }
}
