package JavaCoreTest2;
import java.util.Collections;
import java.util.Stack;

public class Question1 {

    public static void main(String[] args) {

        int[] arr = {23, 45, 22, -34, -89, 203, 78};
        Stack<Integer> stack = new Stack<>();

        for (int i: arr)
            stack.add(i);

        Collections.sort(stack);

        System.out.println("Sorted Stack of Integers: ");
        System.out.println(stack);

    }
}
