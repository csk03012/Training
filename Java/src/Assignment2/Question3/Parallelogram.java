package Assignment2.Question3;

public class Parallelogram extends Trapezoid{

    Parallelogram(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    public String toString(){
        return "Area of Parallelogram: " + area();
    }

}
