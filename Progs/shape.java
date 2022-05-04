class Triangle{
    double side1, side2, side3;
    Triangle(double Side1, double Side2, double Side3){

        this.side1 = Side1;
        this.side2 = Side2;
        this.side3 = Side3;

        double area, perimeter;

        perimeter = side1 + side2 + side3;
        area = 0.5 * (side1 * side2);

        System.out.println("Area : " + area + "\nPerimeter : " + perimeter);
    }
}

public class shape {
    public static void main(String[] args) {
        Triangle tr = new Triangle(3, 4, 5);
    }
}