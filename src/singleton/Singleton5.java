package singleton;

import java.io.*;

/**
 * @描述: 对序列化类实现单例，使用readResolve()方法
 * @作者: suvan
 * @创建日期: 2018-04-08 19:56
 */
public class Singleton5 {
    public static void main(String[] args) {
        MyObject myObject = MyObject.getInstance();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\singletonTest.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(myObject.hashCode());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\singletonTest.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject readObject = (MyObject)objectInputStream.readObject();
            System.out.println(readObject.hashCode());
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyObject implements Serializable {
    private static final long serialVersionUID = -5291186597802279490L;

    private MyObject(){}

    private static class MyObjectHodle {
        static final MyObject myObject = new MyObject();
    }

    public static MyObject getInstance() {
        return MyObjectHodle.myObject;
    }

    /**
     * ObjectInputOutStream类中使用的模板方法模式中的钩子
     * @return
     */
    private Object readResolve() {
        return MyObjectHodle.myObject;
    }
}