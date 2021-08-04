package JavaCoreTest1;

public class Question1 {
    public static void main(String[] args) {
        int n = -123456;
        int ans = 0;
        while (true){
            ans = ans*10 + n%10;
            n = n/10;

            if (n==0)
                break;
        }

        System.out.println("Reversed Number: "+ ans);
    }
}
