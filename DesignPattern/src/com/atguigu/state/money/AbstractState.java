package com.atguigu.state.money;

public abstract class AbstractState implements State {

    protected static final RuntimeException EXCEPTION = new RuntimeException("�������̲�����");

    //�����࣬Ĭ��ʵ���� State �ӿڵ����з���
    //��������з�����������(�����״̬��)��������ѡ��Ľ�����д
    //����
    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    //����ʧ��
    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    //���۷���
    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    //�ӵ�
    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    //���˽ӵ�ʧЧ
    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    //����
    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    //�ӵ�����֧��ʧЧ
    @Override
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    //����
    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
