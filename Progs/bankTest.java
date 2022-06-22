import java.util.Scanner;

class Bank{
    String Name;
    int AccNo;
    char typeAcc;
    int Balance;

    Bank(String N, int AccNo, char type){
        // Method to register a new user 
        this.Name       =   N;
        this.AccNo      =   AccNo;
        this.typeAcc    =   type;
        this.Balance    =   0;
    }

    public void depositMoney(Bank user, int ammount){
        user.Balance += ammount;
        System.out.println("Money deposit succesfull!! Balance : " + user.Balance);
    }

    public void withdrawMoney(Bank user, int ammount){
        if (user.Balance >= 1000){
            user.Balance -= ammount;
            System.out.println("Money withdraw succesfull!! Balance : " + user.Balance);
        }
        else{
            System.out.println("Money withdraw unsuccesfull!!. Insufficient funds. Balance : " + user.Balance);
        }
    }

    public void showDetails(Bank user){
        System.out.println("Name : " + user.Name + "\nAccount Number : " + user.AccNo + "\nAccount Type : " + user.typeAcc + "\nBalance : " + user.Balance);
    }
}


public class bankTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Bank user1 = new Bank("Raveesh Yadav", 123456789, 'S');

        user1.depositMoney(user1, 1500);
        System.out.println("");
        user1.withdrawMoney(user1, 800);       
        System.out.println("");
        user1.showDetails(user1);
    }
}
