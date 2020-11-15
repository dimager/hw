public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize=100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

   /*     arr.display();

        int searchKey = 35;
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Cant find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);*/

        arr.display();

        HighArray sArr = new HighArray(maxSize);

        long el;
        while (true){
            el = arr.removeMax();
            if (el==-1)
                break;
            sArr.insert(el);
        }

        sArr.display();


    }
}
