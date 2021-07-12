package Assignment2.Question1;

// Overriding: it means to override the method of higher level class by
//       defining the same method in subclass. (everything of method in
//       subclass and in parent class should be same.)

public class Overriding {
    public void method(){
        System.out.println("In Overriding class, acting as Superclass of hierarchy");
    }
}

class Child1 extends Overriding{
    // below method "method" is Overriding above method "method" in Overriding class
    // and overridden by Child2 class method "method"
    public void method(){
        System.out.println("In Child1 class inheriting from Overriding class");
    }
}

class Child2 extends Child1{
    public void method(){
        System.out.println("In Child2 class inheriting from Child1 class");
    }

}

class Child3 extends Child2{
    public void method(){
        System.out.println("In Child3 class inheriting from Child2 class");
    }

}

class DriverCode{
    // Polymorphism: When parent class is used to reference a child class.
    public static void main(String[] args) {
        Overriding var1 = new Overriding();
        var1.method();

        Overriding var2 = new Child1();
        var2.method();

        Overriding var3 = new Child2();
        var3.method();

        Overriding var4 = new Child3();
        var4.method();

        // Polymorphism: "Overriding" which as parent class is used to reference a child class.

        Child1 var5 = new Child2();
        var5.method();

        Child2 var6 = new Child3();
        var6.method();

        //Polymorphism: in above example -- Child1 as parent class references
        //                                  Child2 class which is its child.
        //      Same for Child2 (parent class)  and Child3. (subclass)
    }
}