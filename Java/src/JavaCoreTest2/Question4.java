package JavaCoreTest2;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t  = input.nextInt();

        while (t > 0){

            int n = input.nextInt();
            int m = input.nextInt();

            long ans = factorial(n+m-2)/(factorial(n-1)*factorial(m-1));
            System.out.println(ans);

            t -= 1;
        }

    }

    static long factorial(int n){
        long ans = 1;
        for(int i=1; i<=n; i++)
            ans *= i;
        return ans;
    }

}
