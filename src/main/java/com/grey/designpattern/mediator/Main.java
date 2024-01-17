package com.grey.designpattern.mediator;

/**
 * 在主函数中，创建了具体的同事对象 pa 和 pb，以及具体的中介者对象 pm
 * 然后通过调用 pm 的 registered 方法将同事对象注册到中介者中
 * 接着通过同事对象的 sendmsg 方法向其他同事对象发送消息
 *
 * 当一个同事对象调用自己的 sendmsg 方法时，它会通过持有的中介者对象 m_pMediator 调用中介者的 operation 方法，并传递目标同事对象和消息内容
 * 介者根据目标同事对象找到对应的同事对象，并调用其 receivemsg 方法来接收消息
 */
public class Main {
    public static void main(String[] args) {
        ConcreteColleagueA pa = new ConcreteColleagueA();
        ConcreteColleagueB pb = new ConcreteColleagueB();
        ConcreteMediator pm = new ConcreteMediator();
        pm.registered(1, pa);
        pm.registered(2, pb);

        // send msg from A to B
        pa.sendmsg(2, "hello, I am A");
        // send msg from B to A
        pb.sendmsg(1, "hello, I am B");
    }
}
