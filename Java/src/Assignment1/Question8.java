// using long data type to store our factorial value
// range of long data type: min = -pow(2, 63) and max = pow(2, 63) - 1
// problem is long provide us short range, which cannot store value larger then max = pow(2, 63) - 1
// And value of 21! will exceed the range of long, instead of long we can use double for larger range.
package Assignment1;
public class Question8 {
    public static void main(String[] args){
        long ans = 1;
        for(int i=1; i<=20; i++){
            ans *= i;
            System.out.printf("%d! = %-20d%n", i, ans);
        }
    }
}
