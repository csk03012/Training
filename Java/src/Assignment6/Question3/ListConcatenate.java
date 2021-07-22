package Assignment6.Question3;
import java.util.LinkedList;

public class ListConcatenate {

    // Generic method: can be used to concatenate LinkedList of other references types as well.
    // i.e. Integer, Double.
    public static <T> LinkedList<T> concatenate(LinkedList<T> arr1, LinkedList<T> arr2){
        arr1.addAll(arr2);
        return arr1;
    }

    public static void main(String[] args){
        LinkedList<Character> arr1 = new LinkedList<>();
        arr1.add('a');
        arr1.add('b');
        arr1.add('c');

        LinkedList<Character> arr2 = new LinkedList<>();
        arr2.add('c');
        arr2.add('d');
        arr2.add('e');

        LinkedList<Character> arr3 = concatenate(arr1, arr2);
        System.out.println(arr3);
    }
}
