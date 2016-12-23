package singleton;

/**
 * @author suvan
 * @create 2016-12-23-16:41
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
