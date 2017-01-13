package adapter;

/**
 * @author suvan
 * @create 2017-01-13-09:35
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flaying");
    }
}
