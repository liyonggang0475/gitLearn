package designPatter.Memento;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:03
 * @Description:
 */
public class Chess {
    String step;
    int x;
    int y;

    private Container container = new Container();

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

    public Chess(String step, int x, int y) {
        this.step = step;
        this.x = x;
        this.y = y;
        System.out.println(toString());
    }

    void update(String step, int x, int y) {
        this.step = step;
        this.x = x;
        this.y = y;
    }

    void save() {
        container.save(new ChessMemeto(step, x, y));
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Chess{" +
                "step='" + step + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    void undo() {
        ChessMemeto memeto = container.getLastStep();
        if (memeto != null) {
            update(memeto.getStep(), memeto.getX(), memeto.getY());
            container.undo(memeto);
        } else {
            System.out.println("一步都没有走呢还");
        }
        System.out.println(toString());
    }
}
