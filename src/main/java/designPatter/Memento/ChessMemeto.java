package designPatter.Memento;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:02
 * @Description:
 */
public class ChessMemeto {

    String step;
    int x;
    int y;

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ChessMemeto(String step, int x, int y) {
        this.step = step;
        this.x = x;
        this.y = y;
    }
}
