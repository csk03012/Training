package Assignment2.Question3;

public class DriverCode {
    // assumption: each time we find area of trapezoid and its subclasses
    //             the parallel lines should be vertical x axis. assume other cases as quadrilateral.
    //             either line12 and line34 should be parallel or etc.
    //             where 1,2,3,4 are points of quadrilateral.

    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(1,2, 3, 4, 5, 6, 7, 8);
        System.out.println(quadrilateral);

        Trapezoid trapezoid = new Trapezoid(1, 2, 3, -1, 100, 100, -100, -100);
        System.out.println(trapezoid);

        Parallelogram parallelogram = new Parallelogram(1, 5, 3, -1, 100, 100, -100, -100);
        System.out.println(parallelogram);

        Rectangle rectangle = new Rectangle(1, 5, 1, 5, 100, 100, -100, -100);
        System.out.println(rectangle);

        Square square = new Square(1, 5, 1, 5, 100, 100, 104, 104);
        System.out.println(square);
    }

}
