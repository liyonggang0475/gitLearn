package designPatter.Memento;

/**
 * @Author: liyg
 * @Date: 2020-04-01 21:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Container container = new Container();
        Chess chess = new Chess("开始游戏", 1, 1);

        chess.update("1111", 2,5);
        chess.save();

        chess.update("2222", 4,4);
        chess.save();

        chess.update("3333", 6,7);
        chess.save();

        chess.undo();

        chess.undo();

        chess.undo();

        chess.undo();
    }
}
