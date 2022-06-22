/*
a) Write a program in java to check if a class can extends another class and/ can implement one and more than one interface.
b)	Write a program in java to check if an interface can extend other interface.
c)	Write a program in java to check if an interface can also extend multiple interfaces.
Name: Shivam
Roll No: 21CSU090
*/

import java.util.*;

public class Prac6Q1{
	public static void main(String[] args) {
		C obj = new C();
		obj.funcA();
		obj.funcB();
		G obj1 = new G();
		obj1.funcD();
		obj1.funcE();
		obj1.funcF();
	}
}

interface A {
   void funcA();
}
interface B extends A {
   void funcB();
}
class C implements B {
   public void funcA() {
      System.out.println("This is funcA");
   }
   public void funcB() {
      System.out.println("This is funcB");
   }
}

interface D {
	void funcD();
}
interface E {
	void funcE();
}
interface F extends D, E{
	void funcF();
}
class G implements F{
	public void funcD(){
		System.out.println("This is funcD");
	}
	public void funcE(){
		System.out.println("This is funcE");
	}
	public void funcF(){
		System.out.println("This is funcF");
	}
}