import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class tests {
    public static void main(String [] args) {
        C c1 = new C("c1");
        C c2 = new C("c2");
        c1.addApples(5);
        c2.addApples(10);
        c1.addMangoes(15);
        c2.addMangoes(20);
        c1.printApples();
        c2.printApples();
        c1.printMangoes();
        c2.printMangoes();
    }

    static int findOccurences(int[] input, int n){
        int ans = 0;
        Set<Integer> arr = new HashSet<Integer>();
//        Collections.addAll(arr, input);
        return ans;
    }


}

//public class SomethingWrong{
//    private static String name;
//    public SomethingWrong(String n){
//        name = n;
//    }
//    public void saySomething(){
//        System.out.println(this.name + "“ is saying something”");
//    }
//    public static void saySomethingLouder(){
//        System.out.println(this.name + "“ is saying something louder”");
//    }
//}

class A {
    public void sayHello(){
        System.out.println("A says hello");
    }
}
class B extends A{
    public void sayHello(){
        System.out.println("B says hello");
    }
}
class C{
    private static int apples = 0;
    private int mangoes = 0;
    private String name;
    public C(String n){
        name = n;
    }
    public C(){
    }
    public void addApples(int newApples){
        apples += newApples;
    }
    public void addMangoes(int newMangoes){
        mangoes += newMangoes;
    }
    public void printApples(){
        System.out.println(name + " has "+ apples + " apples.");
    }
    public void printMangoes(){
        System.out.println(name + " has "+ mangoes + " mangoes.");
    }
}