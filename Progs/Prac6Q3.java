/*
We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract 
methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters 
of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now 
create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
Name: Shivam
Roll No: 21CSU090
*/

public class Prac6Q3{
	public static void main(String[] args) {
		Area ob = new Area();
		ob.RectangleArea(4, 6);
		ob.SquareArea(4);
		ob.CircleArea(3);
	}
}

abstract class Shape{
	abstract void RectangleArea(int length, int breadth);
	abstract void SquareArea(int side);
	abstract void CircleArea(int radius);
}

class Area extends Shape{
	double area = 0.0;
	void RectangleArea(int length, int breadth){
		area = length * breadth;
		System.out.println("Area of Rectangle is : " + area);
	}

	void SquareArea(int side){
		area = side * side;
		System.out.println("Area of Square is : " + area);
	}

	void CircleArea(int radius){
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle is : " + area);
	}
}