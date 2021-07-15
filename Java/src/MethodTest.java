public class MethodTest {
    public void Name(){
        System.out.println("Hello Intellij");
        System.out.println("Hello Github");
    }

    public static void Name1(){
        System.out.println("Hello");
    }

    public static void main(StringClass[] args) {

        // calling the non-static method in static method
        MethodTest methodTest = new MethodTest();
        methodTest.Name();

        // calling static method in static method
        Name1();
    }
}

class driver{
    public static void main(StringClass[] args) {
        // static method belongs to class instead of instance
        // accessing static method, it always accessed using method name
        MethodTest.Name1();
        // accessing non-static method, create instance or object of the class
        MethodTest methodTest = new MethodTest();
        methodTest.Name();

    }
}