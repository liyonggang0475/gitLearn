package designPatter.iterator;

import java.util.Iterator;

/**
 * @Author: liyg
 * @Date: 2020-04-01 20:09
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
