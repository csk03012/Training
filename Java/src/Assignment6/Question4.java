package Assignment6;
import java.util.*;
import java.util.stream.Stream;

public class Question4 {

    public static  void towerOfHonoi(int n, char src, char dest, char aux, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C){
        if(n>0) {
            towerOfHonoi(n - 1, src, aux, dest, A, C, B);
            System.out.println("moving disk " +A.peek()+ " from rod "+ src + " to rod "+ dest);
            B.add(A.pop());
            System.out.printf("Tower: %s%nTower: %s%nTower: %s%n--------------%n", A, B, C);
            towerOfHonoi(n - 1, aux, dest, src, C, B, A);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[] numArr = {23, 67 ,43, 21};
        Arrays.sort(numArr, Collections.reverseOrder());


        Stack<Integer> stackA = new Stack<>();
        for(Integer num: numArr)
            stackA.add(num);

        Stack<Integer> stackB = new Stack<>();
        Stack<Integer> stackC = new Stack<>();

        System.out.println("Initial: ");
        System.out.printf("Tower A: %s%nTower B: %s%nTower C: %s%n--------------%n", stackA, stackB, stackC);
        char a='a', b='b', c='c';
        towerOfHonoi(stackA.size(), a, c, b, stackA, stackC, stackB);

        System.out.println("Final: ");
        System.out.printf("Tower A: %s%nTower B: %s%nTower C: %s%n--------------%n", stackA, stackB, stackC);
    }
}
