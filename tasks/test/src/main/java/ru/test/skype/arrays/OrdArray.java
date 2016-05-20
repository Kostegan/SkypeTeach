package ru.test.skype.arrays;

/**
 *
 */
public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int maxArray) {
        a = new long[maxArray];
        nElems = 0;
    }

    public int find(long value) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == value) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < value) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int i;
        for (i = 0; i < nElems; i++) {
            if(a[i]>value){
                for(int j = nElems; j > i; j--){
                    a[j] = a[j-1];
                }
                a[i] = value;
                nElems++;
            }
        }
    }

    public boolean delete(long value){

        return true;
    }
}
