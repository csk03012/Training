package Assignment6;
public class Question1 {

    // Generic method
    // Type parameters can only represent references types.
    public static <T> void printArray(T[] arr){
        for(T x: arr)
            System.out.print(x + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] intArray = {11, 22, 33, 44, 55};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("Double Array: ");
        printArray(doubleArray);

        System.out.print("Character Array: ");
        printArray(charArray);
    }
}
