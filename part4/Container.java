package part4;

import java.util.List;

public class Container<T>{

    private T smth;

    public Container(T smth) {
        this.smth = smth;
    }

    public T getSmth() {
        return smth;
    }

    public void setSmth(T smth) {
        this.smth = smth;
    }
}
