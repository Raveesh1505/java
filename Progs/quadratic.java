import java.util.Scanner;
import java.lang.Math;

public class quadratic {
    
    public static void main(String[] args){
        double a, b, c, d, x1, x2, dSqrt;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        if (a == 0){
            System.out.println("Invalid input. A cannot be 0.");
        }
        else{
            System.out.print("Enter the value of b : ");
            b = sc.nextInt();
            System.out.print("Enter the value of c : ");
            c = sc.nextInt();

            sc.close();
            d = Math.pow(b, 2) - 4*a*c;
            dSqrt = Math.sqrt(d);
            
            if (d > 0){
                x1 = (-b + dSqrt)/(4*a*c);
                x2 = (-b - dSqrt)/(4*a*c);
                System.out.println("Two distinct real roots are : \nX1 = " + x1 + "\nX2 = " + x2);
            }
            else if (d == 0){
                x1 = -b/(4*a*c);
                System.out.println("Two same real roots are : \nX = " + x1);
            }
            else if (d < 0){
                System.out.println("No real roots \n");
            }
        }
    }
}
