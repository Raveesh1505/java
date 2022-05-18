import java.util.Scanner;

class divide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, quo;

        System.out.print("Enter first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();

        try{
            quo = num1/num2;
            System.out.print("Quotient = " + quo);
        }
        catch(ArithmeticException e){
            System.out.println("Error - cannot divide by 0");
        }
        
        sc.close();
    }
}