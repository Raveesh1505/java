class Shape{
    String shape;

    public void printShape(){
        System.out.println("This is " + this.shape + " shape.");
    }
}


class Rectangle extends Shape{
    Rectangle(){
        
    }
    public void printShape(){
        shape = "Rectangle";
        System.out.println("This is " + this.shape + " shape.");
    }    
}


class Circle extends Shape{
    Circle(){
       
    }
    public void printShape(){
        shape = "Circle";
        System.out.println("This is " + this.shape + " shape.");
    }
}


class square extends Rectangle{
    square(){
        
    }
  //  Rectangle ob = new Rectangle();
    
    public void printShape(){
        shape = "square";
        System.out.println("This is " + this.shape + " shape.");
    }

    public String TimeAdd(){
        int hours = 120, min = 130;

        return hours + ":" + min;
    }

}


public class shapeInheritance{
    public static void main(String[] args) {
        Rectangle ob = new square();
        ob.printShape();
        ob = new Rectangle();
        ob.printShape();
        ob= new Shape();
        ob.printShape();

        //ob.squareIsRectanlge();
    }
}