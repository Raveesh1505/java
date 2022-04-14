import java.util.Scanner;

public class arrayIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myArray[] = new int[10];
        int i, searchElement;

        for (i=0; i<10; i++){
            System.out.print("Enter the element " + i + " : ");
            myArray[i] = sc.nextInt();
        }

        System.out.print("\nEnter the element to search : ");
        searchElement = sc.nextInt();

        for (i=0; i<10; i++){
            if (myArray[i] == searchElement){
                System.out.println("\nElement : " + myArray[i] + "\nIndex : " + i);
            }
            else{
                System.out.println("\nElement not found\nIndex : -1");
            }
        }
        sc.close();
    }
}