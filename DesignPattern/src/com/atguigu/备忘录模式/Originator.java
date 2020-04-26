package theroy;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 编写一个方法，可以保存一个状态对象Memnto
    // 因此编写一个方法，返回Memento
    public Memento saveStateMemento() {
        return new Memento(state);
    }


    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
