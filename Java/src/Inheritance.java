public class Inheritance {
    protected int a;
    protected int b;

    public void set_values(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(StringClass[] args) {
        Add add = new Add();
        add.set_values(15, 5);
        int x = add.adding();
        System.out.println(x);

        Subtract subtract = new Subtract();
        subtract.set_values(15, 5);
        int y = subtract.subtracting();
        System.out.println(y);
    }
}

class Add extends Inheritance{
    public int adding(){
        return a+b;
    }
}

class Subtract extends  Inheritance{
    public int subtracting(){
        return a-b;
    }
}

