import java.util.Scanner;

class complex {
    int real, img;

    complex(int Real, int Img){
        this.real = Real;
        this.img = Img;
    }

    public void addComplex(complex num2){
        int sumReal, sumImg;

        sumReal = this.real + num2.real;
        sumImg = this.img + num2.img;

        System.out.println("Sum = " + sumReal + "+" + sumImg + "i");
    }

    public void subtComplex(complex num2){
        int sumReal, sumImg;

        sumReal = this.real - num2.real;
        sumImg = this.img - num2.img;

        if (sumImg >= 0){
            System.out.println("Difference = " + sumReal + "+" + sumImg + "i");
        }
        else{
            System.out.println("Difference = " + sumReal + sumImg + "i");
        }
    }
}


class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, i1, i2;

        System.out.print("Enter the real part of first number : ");
        r1 = sc.nextInt();
        System.out.print("Enter the imaginary part of first number : ");
        i1 = sc.nextInt();
        System.out.print("Enter the real part of second number : ");
        r2 = sc.nextInt();
        System.out.print("Enter the imaginary part of second number : ");
        i2 = sc.nextInt();

        complex num1 = new complex(r1, i1);
        complex num2 = new complex(r2, i2);

        num1.addComplex(num2);
        num1.subtComplex(num2);
    }
}