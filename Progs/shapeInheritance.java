class Shape{
    String shape;
    public void printShape(){
        System.out.println("This is " + this.shape + " shape.");
    }
}

class Rectangle extends Shape{
    Rectangle(){
        this.shape = "Rectangle";
    }
}

class Circle extends Shape{
    Circle(){
        this.shape = "Circle";
    }
}

class square extends Rectangle{
    square(){
        this.shape = "Sqaure";
    }
    Rectangle ob = new Rectangle();

    public void squareIsRectanlge(){
        System.out.println(this.shape + " is a " + ob.shape);
    }
}

public class shapeInheritance{
    public static void main(String[] args) {
        square ob = new square();
        ob.printShape();
        ob.squareIsRectanlge();
    }
}