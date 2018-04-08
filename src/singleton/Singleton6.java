package singleton;

/**
 * @描述: 静态方法实现单例
 * @作者: suvan
 * @创建日期: 2018-04-08 20:28
 */
public class Singleton6 {
    private static Singleton6 singleton6;
    static {
        singleton6 = new Singleton6();
    }

    private Singleton6(){}

    public static final Singleton6 getInstance() {
        return singleton6;
    }
}
