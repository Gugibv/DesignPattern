package com.grey.designpattern.state;

/**
 * State 接口定义了状态对象的行为,即 handle() 方法，该方法在不同的具体状态类中有不同的实现
 */
public interface State {
    void handle(Context c);
}
