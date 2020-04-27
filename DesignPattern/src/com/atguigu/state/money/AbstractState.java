package com.atguigu.state.money;

public abstract class AbstractState implements State {

    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

    //抽象类，默认实现了 State 接口的所有方法
    //该类的所有方法，其子类(具体的状态类)，可以有选择的进行重写
    //电审
    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    //电审失败
    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    //定价发布
    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    //接单
    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    //无人接单失效
    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    //付款
    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    //接单有人支付失效
    @Override
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    //反馈
    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
