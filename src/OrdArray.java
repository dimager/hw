import com.sun.org.apache.xpath.internal.operations.Or;

public class OrdArray {
    private final long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }


    public int find2(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        if (a[lowerBound]>searchKey || nElems == 0)
            return 0;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (lowerBound > upperBound){
                break;}
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else if (a[curIn] > searchKey)
                    upperBound = curIn - 1;
                else
                    return -1;
            }
        }
        return curIn+1;
    }

    public void insert2(long value) {
        int pos = find2(value);
        //System.out.println("value " + value + " pos " + pos);
        //  System.out.println(value);

        if (pos == -1)
            System.out.println("value " + value + " already in array");

        else {
            for (int j = nElems-1; j >= pos; j--)
                a[j + 1] = a[j];
            a[pos] = value;
            nElems++;
        }
    }



    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] > value)
                break;
        for (int k = nElems; k > j; k--)
            a[k] = a[k - 1];
        a[j] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void  display(){
        for (int j=0;j<nElems;j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public long getValueByIndexAndDelete(int i){
        long value=a[i];
        //delete(value);
        return value;
    }

    public static OrdArray merge (OrdArray A, OrdArray B){
        OrdArray mArr = new OrdArray(A.size() +B.size());
        int s;
        s=A.size()-1;
        while (s>=0){
            mArr.insert(A.getValueByIndexAndDelete(s));
            s--;
        }
        s=B.size()-1;
        while (s>=0){
            mArr.insert(B.getValueByIndexAndDelete(s));
            s--;
        }
        return mArr;
    }

    public static OrdArray merge2 (OrdArray A, OrdArray B){
        OrdArray mArr = new OrdArray(A.size() +B.size());
        int s;
        s=A.size()-1;
        while (s>=0){
            mArr.insert2(A.getValueByIndexAndDelete(s));
            s--;
        }
        s=B.size()-1;
        while (s>=0){
            mArr.insert2(B.getValueByIndexAndDelete(s));
            s--;
        }
        return mArr;
    }
}

