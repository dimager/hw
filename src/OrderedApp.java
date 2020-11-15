public class OrderedApp {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr,arr2;
        arr = new OrdArray(maxSize);
  //      arr.insert(44);
//        arr.insert(99);
//        arr.insert(77);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(5);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(66);
//        arr.insert(33);


        arr.insert2(44);
        arr.insert2(99);
        arr.insert2(77);
        arr.insert2(55);
        arr.insert2(22);
        arr.insert2(5);
        arr.insert2(88);
        arr.insert2(11);
        arr.insert2(66);
        arr.insert2(33);
        arr.insert2(2);
        arr.insert2(100);
        arr.insert2(4);





       /* arr2 = new OrdArray(maxSize);
        arr2.insert(78);
        arr2.insert(94);
        arr2.insert(41);
        arr2.insert(57);
        arr2.insert(23);
        arr2.insert(84);
        arr2.insert(16);
        arr2.insert(8);
        arr2.insert(67);
        arr2.insert(38);*/

        arr.display();
       /* arr2.display();

        OrdArray.merge(arr,arr2).display();
        OrdArray.merge2(arr,arr2).display();*/




       // OrdArray.merge()
      //  System.out.println("arr.find(25) = " + arr.find(25));

       /* int searchKey = 55;
        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Cant find " + searchKey);
        arr.display();
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();*/
    }
}
