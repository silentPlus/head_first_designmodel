package singleton;

/**
 * @描述: 静态内部类实现单例模式
 * @作者: suvan
 * @创建日期: 2018-04-08 19:29
 */
public class Singleton4 {
    private Singleton4(){}
    private static class SingletonHolder {
        static final Singleton4 SINGLETON = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
