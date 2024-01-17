package com.grey.designpattern.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * ConcreteMediator 类是具体的中介者实现，它维护了一个映射表 m_mpColleague，用于存储对应的同事对象
 */
public class ConcreteMediator  implements Mediator{
    private Map<Integer, Colleague> m_mpColleague;

    public ConcreteMediator() {
        m_mpColleague = new HashMap<>();
    }

    @Override
    public void operation(int nWho, String str) {
        if (!m_mpColleague.containsKey(nWho)) {
            System.out.println("not found this colleague!");
            return;
        }

        Colleague pc = m_mpColleague.get(nWho);
        pc.receivemsg(str);
    }

    @Override
    public void registered(int nWho, Colleague aColleague) {
        if (!m_mpColleague.containsKey(nWho)) {
            m_mpColleague.put(nWho, aColleague);
            // 同时将中介类暴露给 colleague
            aColleague.setMediator(this);
        }
    }
}
