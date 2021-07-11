/* abstract public class Interface {
    abstract public int func();
} */


public interface Interface {
    int func();
    int func1();
    int func2();
}

// above both class is same...as interface can be replaced as abstract class or method.
// and in interface class all methods(all members)  will be abstract in nature.
// all the interface classes can be implemented by its chile, cannot be extend

/*
class class extend
interface class implement
interface interface extend
 */
class child1 implements Interface{
    public int func(){
        return 100;
    }

    public int func1(){
        return 200;
    }

    public int func2(){
        return 300;
    }
}