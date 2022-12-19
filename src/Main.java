public class Main {
    public static void main(String[] args) {

        int count=10000;

        System.out.println("=====ADD-FIRST=====");
        System.out.println("---Add elements ( " + count + " )");
        System.out.println("test add-first for arrayList " + Comparing.testAddFirstArray(count));
        System.out.println("test add-first for linkedList " + Comparing.testAddFirstLinked(count));

        if ((Comparing.testAddFirstLinked(count)) <= (Comparing.testAddFirstArray(count)))
            System.out.println("LinkedList is faster");
        else System.out.println(("ArrayList is faster"));

        System.out.println("=====GET-FIRST=====");
        System.out.println("---Get elements ( " + count + " )");
        System.out.println("test get-first for linkedList " + Comparing.testGetFirstArray(count));
        System.out.println("test get-first for arrayList " + Comparing.testGetFirstLinked(count));

        if ((Comparing.testGetFirstLinked(count)) <= (Comparing.testGetFirstArray(count)))
            System.out.println("LinkedList is faster");
        else System.out.println(("ArrayList is faster"));

        System.out.println("=====DELETE-FIRST=====");
        System.out.println("---Delete elements ( " + count + " )");
        System.out.println("test delete-first for arrayList " + Comparing.testDeleteFirstArray(count));
        System.out.println("test delete-first for linkedList " + Comparing.testDeleteFirstLinked(count));

        if ((Comparing.testDeleteFirstLinked(count)) <= (Comparing.testDeleteFirstArray(count)))
            System.out.println("LinkedList is faster");
        else System.out.println(("ArrayList is faster"));

        System.out.println("=====ADD-LAST=====");
        System.out.println("---Add elements ( " + count + " )");
        System.out.println("test add-last for arrayList " + Comparing.testAddLastArray(count));
        System.out.println("test add-last for linkedList " + Comparing.testAddLastLinked(count));

        if ((Comparing.testAddLastLinked(count)) <= (Comparing.testAddLastArray(count)))
            System.out.println("LinkedList is faster");
        else System.out.println(("ArrayList is faster"));

        System.out.println("=====GET-LAST=====");
        System.out.println("---Get elements ( " + count + " )");
        System.out.println("test get-last for linkedList " + Comparing.testGetLastArray(count));
        System.out.println("test get-last for arrayList " + Comparing.testGetLastLinked(count));

        if ((Comparing.testGetLastLinked(count)) <= (Comparing.testGetLastArray(count)))
            System.out.println("LinkedList is faster");
        else System.out.println(("ArrayList is faster"));

        System.out.println("=====DELETE-LAST=====");
        System.out.println("---Delete elements ( " + count + " )");
        System.out.println("test delete-last for arrayList " + Comparing.testDeleteLastArray(count));
        System.out.println("test delete-las for linkedList " + Comparing.testDeleteLastLinked(count));

        if ((Comparing.testDeleteLastLinked(count)) <= (Comparing.testDeleteLastArray(count)))
            System.out.println("LinkedList is faster");
        else System.out.println(("ArrayList is faster"));

    }
}
