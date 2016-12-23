package singleton;

/**
 * @author suvan
 * @create 2016-12-23-16:41
 */
public class Singleton1 {
    private static Singleton1 singleton;

    private Singleton1() {}

    public static synchronized Singleton1 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton1();
        }

        return singleton;
    }
}
