package Assignment1;
import java.lang.Math;

public class Question7 {
    public static void main(String[] args){
        int a, c, b;
        for(a=1; a<=500;a++){
            for(b=a;b<=500; b++){
                for(c=b; c<=500; c++){
                    if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
                        System.out.printf("%3d %3d %3d%n", a, b, c);
                    }
                }
            }
        }
    }
}
