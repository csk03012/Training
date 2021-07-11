public class Polymorphism {
    // 1.having different forms
    // 2.one the most common use of polymorphism is when when parent class is used to
    //                     to reference a child class.

    //3. abstract method can be present in abstract class
    public int func(){
        return 100;
    }
    public static void main(String[] args) {
        Polymorphism var1 = new Polymorphism();
        System.out.println(var1.func());

        Polymorphism var2 = new Polymorphism1();
        System.out.println(var2.func());

        Polymorphism var3 = new Polymorphism2();
        System.out.println(var3.func());

        Polymorphism var4 = new Polymorphism3();
        System.out.println(var4.func());

    }
}

class Polymorphism1 extends Polymorphism{
    public int func(){
        return 200;
    }
}

class Polymorphism2 extends Polymorphism{
    public int func(){
        return 300;
    }
}

class Polymorphism3 extends Polymorphism{
    public int func(){
        return 400;
    }
}