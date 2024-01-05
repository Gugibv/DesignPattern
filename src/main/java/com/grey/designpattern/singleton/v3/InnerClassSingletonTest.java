package com.grey.designpattern.singleton.v3;

import java.io.*;
import java.lang.reflect.InvocationTargetException;


public class InnerClassSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        // 内部类创建单例演示：
        //        InnerClassSingleton instance=InnerClassSingleton.getInstance();
        //        InnerClassSingleton instance1=InnerClassSingleton.getInstance();
        //
        //        System.out.println(instance==instance1);
        // System.out.println(InnerClassSingleton.name);


// 反射攻击演示：
//        Constructor<InnerClassSingleton> declaredConstructor=InnerClassSingleton.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible( true );
//        InnerClassSingleton innerClassSingleton=declaredConstructor.newInstance();
//        InnerClassSingleton instance=InnerClassSingleton.getInstance();
//
//        System.out.println(innerClassSingleton==instance);
// 解决： 单例创建类构造方法加方法判断


// 将内存中的数据，序列化到磁盘上面，名称为 instance
        //序列化：
        InnerClassSingleton instance=InnerClassSingleton.getInstance();
        try(ObjectOutputStream oos=new ObjectOutputStream( new FileOutputStream( "instance" ) )) {
            oos.writeObject( instance );
        }

        // 反序列化：
        try (ObjectInputStream ois=new ObjectInputStream( new FileInputStream( "instance" ) )) {
            InnerClassSingleton innerClassSingleton=(InnerClassSingleton) ois.readObject();

            System.out.println( innerClassSingleton == instance ); //从磁盘上反序列号拿到的对象和从JVM中拿到的对象是相同的

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

class InnerClassSingleton implements Serializable {
    private static final long serialVersionUID = 6922639953390195232L;
    // private  static final long serialVersionUID = 42L;
    public static String name="yyy";
    public static String name1="yyy";
    public static String name2="yyy";

    static {
        System.out.println( " InnerClassSingleton " ); //  1
    }

    private InnerClassSingleton() {

        if (SingletonHolder.instance != null) {  // 加判断避免反射攻击
            throw new RuntimeException( " 不允许多个实例。" );
        }

    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    Object readResolve() throws ObjectStreamException {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static InnerClassSingleton instance=new InnerClassSingleton();

        static {
            System.out.println( " SingletonHolder " );// 2
        }
    }

}
