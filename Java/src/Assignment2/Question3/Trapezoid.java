package Assignment2.Question3;

public class Trapezoid extends Quadrilateral{
    Trapezoid(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
        super(x1, x2, x3, x4, y1, y2, y3, y4);
    }
    // logic behind area of trapezoid as well as its all subclasses.
    // sideSum method: it give sum of two parallel side.
    // height method: it gives height between the parallel side.
    public double area(){
        return sideSums()*height()/2.0;
    }

    double x1=getP1()[0], y1=getP1()[1];
    double x2=getP2()[0], y2=getP2()[1];
    double x3=getP3()[0], y3=getP3()[1];
    double x4=getP4()[0], y4=getP4()[1];

    public double sideSums(){
        if (y2==y3)
            return Math.abs(x2-x3) + Math.abs(x4-x1);
        else
            return Math.abs(x1-x2) + Math.abs(x3-x4);
    }

    // one more assumption: parallel side is parallel to x-axis
    // two sets of pairs should have equal y coordinate.
    //  1----2      2----3      3----4    4----1
    //  4----3      1----4      2----1    3----2
    // case1        case2        case3   case4
    public double height(){
        if (y2==y3) // case2 case4
            return Math.abs(y2-y1);
        else //case1 case4
            return Math.abs(y3-y1);
    }

    public String toString(){
        return "Area of Trapezoid: " + area();
    }
}
