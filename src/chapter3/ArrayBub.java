package chapter3;

public class ArrayBub {
    private long a[];
    private int nElems;
    private int cSwaps;

    public ArrayBub(int max) {
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

    public void bubbleSort() {
        int check = 0;
        int sw = 0;
        int out, in;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                check++;
                if (a[in] > a[in + 1]) {
                    swap(in);
                    sw++;
                }
            }
        }
        System.out.println("check = " + check);
        System.out.println("sw = " + sw);
    }

    public void oddEvenSort() {
        cSwaps = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            System.out.println("odd swap");
            for (int i = 0; i < nElems - 1; i = i + 2) {
                if (a[i] > a[i + 1]) {
                    swap(i);
                    sorted = false;
                    cSwaps++;
                    System.out.println("cSwaps = " + cSwaps);
                    display();
                }
            }
            System.out.println("even swap");
            for (int i = 1; i < nElems - 1; i = i + 2) {
                if (a[i] > a[i + 1]){
                    swap(i);
                    sorted = false;
                    cSwaps++;
                    System.out.println("cSwaps = " + cSwaps);
                    display();

                }
            }
        }
        System.out.println("cSwaps = " + cSwaps);
    }
    private void swap(int in) {
        long tmp = a[in];
        a[in] = a[in + 1];
        a[in + 1] = tmp;
    }
}


