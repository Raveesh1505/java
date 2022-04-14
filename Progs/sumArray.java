import java.util.Scanner;

public class sumArray {
    public static void main(String[] args){
        int myArray[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int i, sumElements = 0, sumAlternative = 0;

        for (i = 0; i < 5; i++){
            System.out.print("Enter the element " + i + " : ");
            myArray[i] = sc.nextInt();
        }

        // Sum of all elements
        for (i = 0; i < 5; i++){
            sumElements += myArray[i];
        }

        // Sum alternative elements
        for (i = 0; i < 5; i+=2){
            sumAlternative += myArray[i];
        }
        System.out.println("\nSum of all elements : " + sumElements + "\nSum of alternative elements : " + sumAlternative);
        sc.close();
    }
}