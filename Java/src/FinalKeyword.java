public class FinalKeyword {
/*
AccessModifier Class package Subclass World
private         Y       N       N       N
public          Y       Y       Y       Y
protected       Y       Y       Y       N
no modifier     Y       Y       N       N
 */

/*
Final Keyword:
- Final keyword always be initialized once. and (observe) should initialized in class
- Final class can not be subclassed. (or any subclass cannot inherit from final subclass)
- Final method cannot be overridden.
 */

    public final int fnl;
    FinalKeyword(){
        this.fnl = 0;
    }

    public final int add(int a, int b){
        return a+b;
    }
    // add method can be overridden in given class but not in subclass.
    public final int add(float a, float b){
        return (int) (a+b);
    }

    public static void main(StringClass[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
        // we cannot initialize final variable;
//         finalKeyword.fnl = 10;

    }
}

class subclass extends FinalKeyword {
    // class is inheriting from FinalKeyword class which makes it subclass of it.
    // it means it cannot override final method.
//    public float add(float a, float b){
//        return a+b;
//    }
}
