import java.util.Scanner;

public class arrayMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myArray[] = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Enter the " + i + " element : ");
            myArray[i] = sc.nextInt();
        }

        // Minimum value in the array
        int min = myArray[0];
        for (int i = 0; i < 10; i++){
            if (myArray[i] < min){
                min = myArray[i];
            }
        }

        // Maximum value in the array
        int max = myArray[0];
        for (int i = 0; i < 10; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.print("\nMaximum value : " + max + "\nMinimum value : " + min);
        sc.close();
    }
}