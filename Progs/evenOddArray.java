import java.util.Scanner;

public class evenOddArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myArray[] = new int[10];
        int evenArray[] = new int[10];
        int oddArray[] = new int[10];
        int i, evenCounter = 0, oddCounter = 0;

        for (i=0; i<10; i++){
            System.out.print("Enter the element " + i + " : ");
            myArray[i] = sc.nextInt();
        }
        

        for(i = 0; i<10; i++){
            if (myArray[i]%2 == 0){
                evenCounter += 1;
                evenArray[evenCounter] = myArray[i];
            }
            else{
                oddCounter += 1;
                oddArray[oddCounter] = myArray[i];
            }
        }

        System.out.println("\nEven elemets : " + evenCounter + "\nOdd elements : " + oddCounter);

        System.out.println("\nEVEN ARRAY : ");
        for (i = 0; i< 10; i++){
            if (evenArray[i] != 0){
                System.out.print(evenArray[i] + ", ");
            }
        }
        System.out.println("\nODD ARRAY : ");
        for (i = 0; i< 10; i++){
            if (oddArray[i] != 0){
                System.out.print(oddArray[i] + ", ");
            }
        }
        sc.close();
    }
}
