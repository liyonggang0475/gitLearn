package designPatter.iterator;

import java.util.Iterator;

/**
 * @Author: liyg
 * @Date: 2020-04-01 19:58
 * @Description:
 */
public class MyList implements Iterable{
    int[] data = new int[5];

    public MyList() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (i+1)*10;
        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        @Override
        public Object next() {
            return data[index++];
        }
    }
}
