package bao7_spring_buybooks;

/**
 * @Title buy2Impl
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 14:11
 */

public class buy2Impl implements buy2 {
    private buy b;

    public void setB(buy b) {
        this.b = b;
    }

    //    @Transactional
    @Override
    public void purchase2(String name, int[] id) {
        for(int t:id)
        {
            b.purchase(name,t);
        }
    }
}
