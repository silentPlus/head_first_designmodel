package singleton;

/**
 * @author suvan
 * @create 2016-12-23-16:58
 */
public class Singleton2 {
    private static Singleton2 singleton = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getSingleton() {
        return singleton;
    }
}
