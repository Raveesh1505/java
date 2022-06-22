import java.util.Scanner;

class area{
    int Length, Breadth;
    
    area(int length, int breadth){
        this.Length = length;
        this.Breadth = breadth;
    }

    public int returnArea(){
        int area;
        area = Length*Breadth;
        return area;
    }
}


public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth;
        System.out.print("Enter the length : ");
        length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        breadth = sc.nextInt();
        area ar = new area(length, breadth);
        System.out.println(ar.returnArea());
    }
}
