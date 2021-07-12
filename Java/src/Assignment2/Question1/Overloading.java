package Assignment2.Question1;

// Overloading: It means method name is same, it just taking different data type as argument
public class Overloading {

    public int hello(int i){
        System.out.println("Hello method with int type argument");
        return i;
    }
    public double hello(double i){
        System.out.println("Hello method with double type argument");
        return i;
    }

    public double hello(double i, double j){
        System.out.println("Hello method with two double type argument");
        return i+j;
    }
}

class Children extends Overloading{

    public double hello(double i, double j){
        System.out.println("1Hello method with two double type argument: method overrides");
        return i+j;
    }

    public String hello(String s){
        System.out.println("1Hello method with String type argument: Overloading method.");
        return s;
    }
}

class DriverCodes{
    public static void main(String[] args) {
        Overloading var1 = new Overloading();
        var1.hello(2);
        var1.hello(2.98);
        var1.hello(2.78, 7.8);

        // Polymorphism
        Overloading var2 = new Children();
        var2.hello(2);
        var2.hello(2, 5);

        // var3 can access all method defined in subclass as well as parent class.
        Children var3 = new Children();
        var3.hello("Good");
        var3.hello(2, 3);

        // It was observe while coding in Intellij IDE.
        // observation, if subclass referenced from its parent class
        //              then it can access it method defined in subclass but not all.
        // it can access overridden method not overloaded.
        // it can seen in code line 43 and 37.
    }
}