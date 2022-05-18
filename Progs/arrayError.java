import java.util.Scanner;

public class arrayError {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] myArray = new int[5];
//        int num1, num2, quo;

//        System.out.print("Enter number 1 : ");
//        num1 = sc.nextInt();
//       System.out.print("Enter number 2 : ");
//        num2 = sc.nextInt();

        try{
            System.out.println(myArray[6]);
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
        finally{
            System.out.println("bye!!!");
        }

    }
}