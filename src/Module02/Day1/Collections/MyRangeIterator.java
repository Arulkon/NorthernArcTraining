package Module02.Day1.Collections;

import java.util.Iterator;

public class MyRangeIterator implements Iterator {
    private int start;
    private int end;
    public MyRangeIterator(int start,int end){
        this.start=start;
        this.end=end;
    }


    @Override
    public boolean hasNext() {
        return start<=end;
    }

    @Override
    public Object next() {
        int old=start;
        start++;
        return old;
    }
}
