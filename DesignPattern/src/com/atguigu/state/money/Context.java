package com.atguigu.state.money;

//环境上下文
public class Context extends AbstractState{
	//当前的状态 state, 根据我们的业务流程处理，不停的变化
	private State state;

	//电审
    @Override
    public void checkEvent(Context context) {
        state.checkEvent(this);
        getCurrentState();
    }

    //电审失败
    @Override
    public void checkFailEvent(Context context) {
        state.checkFailEvent(this);
        getCurrentState();
    }

    //定价发布
    @Override
    public void makePriceEvent(Context context) {
        state.makePriceEvent(this);
        getCurrentState();
    }

    //接单
    @Override
    public void acceptOrderEvent(Context context) {
        state.acceptOrderEvent(this);
        getCurrentState();
    }

    //无人接单失效
    @Override
    public void notPeopleAcceptEvent(Context context) {
        state.notPeopleAcceptEvent(this);
        getCurrentState();
    }

    //付款
    @Override
    public void payOrderEvent(Context context) {
        state.payOrderEvent(this);
        getCurrentState();
    }

    //接单有人支付失效
    @Override
    public void orderFailureEvent(Context context) {
        state.orderFailureEvent(this);
        getCurrentState();
    }

    //反馈
    @Override
    public void feedBackEvent(Context context) {
        state.feedBackEvent(this);
        getCurrentState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String getCurrentState() {
        System.out.println("当前状态 : " + state.getCurrentState());
        return state.getCurrentState();
    }
}
