package designPatter.observe.api;

import java.util.Observable;

/**
 * @Author: liyg
 * @Date: 2020-04-05 16:43
 * @Description:
 */
public class JDKObserveable extends Observable {
    private int data = 0;
    public JDKObserveable() {

        setChanged();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        int oldData = this.data;
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
}
