import java.util.Scanner;

class distance {
    
    double x, y;

    distance(double X, double Y){
        this.x = X;
        this.y = Y;
    }

    public double distCalcX(distance pt){
        double distX;
        distX = this.x - pt.x;
        return distX;
    }

    public double disCalcY(distance pt){
        double distY;
        distY = this.y - pt.y;
        return distY;
    }
}

class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2;

        System.out.print("Enter X1 : ");
        x1 = sc.nextInt();
        System.out.print("Enter Y1 : ");
        y1 = sc.nextInt();
        System.out.print("Enter Y1 : ");
        x2 = sc.nextInt();
        System.out.print("Enter Y2 : ");
        y2 = sc.nextInt();

        distance pt1 = new distance(x1, y1);
        distance pt2 = new distance(x2, y2);

        System.out.println("Distance X = " + pt1.distCalcX(pt2) + "\nDistance Y = " + pt1.disCalcY(pt2));
    }
}