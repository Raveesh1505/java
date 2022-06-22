import java.lang.*;

interface A { }
class C { }
class D extends C { }

class B extends D implements A { } 

public class test extends Thread{
    public static void main(String[] args){
        B b = new B();
        if (b instanceof A){
            System.out.println("b is an instance of A"); 
        }
        if (b instanceof C){
            System.out.println("b is an instance of C");
        }
    }
}
    