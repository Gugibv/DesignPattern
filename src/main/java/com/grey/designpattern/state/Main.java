package com.grey.designpattern.state;

/**
 * 在主函数中，创建了一个 Context 对象并进行了一系列的请求处理：
 * 首先，创建了一个 Context 对象 c，其默认状态为 ConcreteStateA。
 * 然后，通过调用 c.request() 方法进行请求处理。由于初始状态是 ConcreteStateA，因此会在控制台上打印出 "Doing something in State A." 的消息，并将状态切换为 ConcreteStateB。
 * 接下来，再次调用 c.request() 方法，此时由于状态已变为 ConcreteStateB，因此会在控制台上打印出 "Doing something in State B." 的消息，并将状态切换回 ConcreteStateA。
 * 最后，再次调用 c.request() 方法，又会在控制台上打印出 "Doing something in State A." 的消息。
 */
public class Main {
    public static void main(String[] args) {
        char a = '0';
        if ('0' == a)
            System.out.println("yes");
        else
            System.out.println("no");

        Context c = new Context();
        c.request();
        c.request();
        c.request();
    }
}
