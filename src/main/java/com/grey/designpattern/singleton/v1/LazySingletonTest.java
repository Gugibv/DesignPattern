package com.grey.designpattern.singleton.v1;


public class  LazySingletonTest {
    public static void main(String[] args) {


        Thread thread1=new Thread( () -> {
            LazySingleton instance=LazySingleton.getInstance();
            System.out.println( instance );

        } );


        Thread thread2=new Thread( () -> {
            LazySingleton instance=LazySingleton.getInstance();
            System.out.println( instance );

        } );

        thread1.start();
        thread2.start();


    }
}
class LazySingleton{

    private volatile static LazySingleton instance;
    private LazySingleton(){

    }
    public  static LazySingleton getInstance() {

        if (instance==null){

            synchronized (LazySingleton.class){ // synchronized 不加在方法上，可以减少线程等待的时间
                                                // 不是采用this，因为getInstance是一个静态方法，在它内部不能使用未静态的或者未实例的类对象
                if (instance==null){
                   // JIT 即时编译， CPU 重排 ，第1步和 第2步在单线程的场景下是没有影响的
                   // 线程1进来先执行了第1步，第3步，还未执行第2步，此时线程2进来这里，去判断instance 是否为空，拿到的结果不为空返回给客户端后，就不会导致空指针错误
                    // 解决： 增加 volatile
                    instance=new LazySingleton();
                    // 字节码层面：
                    //  1.分配空间
                    //  2.初始化
                    //  3.赋值

                }
            }
        }
        return instance;
    }
}