package adapter;

/**
 * 适配器模式：讲一个类的接口，转换成客户期望的另一个接口。
 * 适配器让原本接口不兼容的类可以合作无间
 * @author suvan
 * @create 2017-01-13-09:49
 */
public class DuckTestDrive {
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
}
