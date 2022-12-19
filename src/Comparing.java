import java.util.ArrayList;
import java.util.LinkedList;

public class Comparing {

    private static LinkedList<Integer> list = new LinkedList<Integer>();

    private static ArrayList<Integer> array=new ArrayList<Integer>();

    public static long testAddFirstLinked (int count){

        long startTimeLinked = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            list.addFirst(i);
        }
        long endTimeLinked = System.currentTimeMillis();
        return endTimeLinked - startTimeLinked;

    }

    public static long testAddFirstArray (int count){

        long startTimeArray = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            array.add(0,i);
        }
        long endTimeArray = System.currentTimeMillis();
        return endTimeArray - startTimeArray;

    }

    public static long testAddLastLinked (int count){

        long startTimeLinked = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            list.addLast(i);
        }
        long endTimeLinked = System.currentTimeMillis();
        return endTimeLinked - startTimeLinked;
    }

    public static long testAddLastArray (int count){

        long startTimeArray = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            array.add(i);
        }
        long endTimeArray = System.currentTimeMillis();
        return endTimeArray - startTimeArray;
    }

    public static long testGetFirstLinked (int count){

        long startTimeLinked = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            list.getFirst();
        }
        long endTimeLinked = System.currentTimeMillis();
        return endTimeLinked - startTimeLinked;
    }

    public static long testGetFirstArray (int count){

        long startTimeArray = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            array.get(0);
        }
        long endTimeArray = System.currentTimeMillis();
        return endTimeArray - startTimeArray;
    }

    public static long testGetLastLinked (int count){

        long startTimeLinked = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            list.getLast();
        }
        long endTimeLinked = System.currentTimeMillis();
        return endTimeLinked - startTimeLinked;
    }

    public static long testGetLastArray (int count){

        long startTimeArray = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            array.get(count - 1);
        }
        long endTimeArray = System.currentTimeMillis();
        return endTimeArray - startTimeArray;
    }
    public static long testDeleteFirstLinked (int count){

        long startTimeLinked = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            list.removeFirst();
        }
        long endTimeLinked = System.currentTimeMillis();
        return endTimeLinked - startTimeLinked;
    }

    public static long testDeleteFirstArray (int count){

        long startTimeArray = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            array.remove(0);
        }
        long endTimeArray = System.currentTimeMillis();
        return endTimeArray - startTimeArray;
    }

    public static long testDeleteLastLinked (int count){

        long startTimeLinked = System.currentTimeMillis();

        for ( int i=0; i<count; i++){
            list.removeLast();
        }
        long endTimeLinked = System.currentTimeMillis();
        return endTimeLinked - startTimeLinked;
    }

    public static long testDeleteLastArray (int count){

        long startTimeArray = System.currentTimeMillis();

        for ( int i=count -1 ; i>=0; i--){
            array.remove(i);
        }
        long endTimeArray = System.currentTimeMillis();
        return endTimeArray - startTimeArray;
    }


}