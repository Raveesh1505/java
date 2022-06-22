import java.util.Scanner;

class vehicle {
    String displayOb = "vehicle";
    public void display(){
        System.out.println("This is a " + this.displayOb);
    }
}

class car extends vehicle {
    car(){
        this.displayOb = "Car";
    }
}

class bike extends vehicle {
    bike(){
        this.displayOb = "bike";
    }
}

public class vehicleTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        car Car = new car();    // Object of class car
        bike Bike = new bike(); // Object of class bike

        System.out.print("Enter number of wheels : ");
        N = sc.nextInt();

        if (N == 2){
            Bike.display();
        }
        else if (N == 4){
            Car.display();
        }
    }
}