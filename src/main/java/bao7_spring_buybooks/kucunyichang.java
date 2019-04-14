package bao7_spring_buybooks;

/**
 * @Title kucunyichang
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\9\5 0005 9:28
 */
public class kucunyichang extends RuntimeException {
    public kucunyichang() {
    }

    public kucunyichang(String message) {
        super(message);
    }

    public kucunyichang(String message, Throwable cause) {
        super(message, cause);
    }

    public kucunyichang(Throwable cause) {
        super(cause);
    }

    public kucunyichang(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
