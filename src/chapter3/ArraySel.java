package chapter3;

public class ArraySel {
    private long a[];
    private int nElems;

    public ArraySel(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void slectionSort() {
        int in, out, min;
        for (out = 0; out < nElems - 1; out++) {
            min = out;
            for (in = out + 1; in < nElems; in++)
                if (a[in] < a[min])
                    min = in;
            swap(out, min);
        }
    }

    private void swap(int out, int min) {
        long temp = a [min];
        a[min]=a[out];
        a[out]=temp;
    }
}
