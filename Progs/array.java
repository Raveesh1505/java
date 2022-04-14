import java.util.Scanner;

public class array {

    public static void main(String[] args){
        int n, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        n = sc.nextInt();

        int X[] = new int[n];

        for (i = 0; i<n; i++){
            System.out.print("Enter the element " + i + " : ");
            X[i] = sc.nextInt();
        }

        // Forward printing
        System.out.println("FORWARD PRINTING");
        for (i = 0; i<n; i++){
            System.out.print(X[i] + " ");
        }

        // Backward printing
        System.out.println("\nBACKWARD PRINTING");
        for (i=n-1; i >= 0; i--){
            System.out.print(X[i] + " ");
        }    
        sc.close();
    }
}