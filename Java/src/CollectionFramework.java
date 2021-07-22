import java.util.*;

public class CollectionFramework {
    // can remove typeParameter in this case and replace other T as Object.
    public static <T> void printArray(T[] arr){
        for(T ele: arr)
            System.out.print(ele+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(3);
        arr1.add(9);
        System.out.println(arr1);

        LinkedList<Integer> arr2 = new LinkedList<Integer>();
        arr2.add(2);
        arr2.add(3);
        System.out.println(arr2);

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(0);
        arr3.add(9);
        arr3.add(10);
        arr3.add(10);
        System.out.println(arr3);

        HashSet<Integer> arr4 = new HashSet<>();
        arr4.add(100);
        arr4.add(100);
        System.out.println(arr4);

        List<Integer> arr5 = new ArrayList<>(); // upcasting as ArrayList extends list.

        // generic method testing
//        int[] intArr = {1,2,3,4};
//        char[] charArr = {'a', 'b', 'c'};
        // above primitive type var can't be used in generic method.
        Integer[] intArr = {1,2,3,4};
        Character[] charArr = {'a', 'b', 'c'};
        printArray(intArr);
        printArray(charArr);


    }
}

