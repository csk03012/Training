package Assignment2.Question3;

public class Quadrilateral {
    // all four points of quadrilateral
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    Quadrilateral(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        p4 = new Point(x4, y4);
    }

    public double[] getPoint(Point p){
        return new double[]{p.getX(), p.getY()};
    }

    public double[] getP1() {
        return getPoint(p1);
    }

    public double[] getP2() {
        return getPoint(p2);
    }

    public double[] getP3() {
        return getPoint(p3);
    }

    public double[] getP4() {
        return getPoint(p4);
    }

    public String toString(){
        return "No area method for quadrilateral";
    }
}
