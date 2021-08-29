import java.util.Collections;

//public class testtt
//{
//    public static void main(String[] args) {
//        i   nt a = 0;
//    }
//}
abstract class As {
    int i;
    abstract void display();
}
class Bs extends As {
    int j;
    void display() {
        System.out.print(j + " ");
    }
}
class Main {
    public static void main(String args[]) {
        Bs obj1 = new Bs();
        obj1.j = 2;
        obj1.display();
        As obj2 = new Bs();
        obj2.i = 2;
        obj2.display();
    }
}