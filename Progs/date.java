import java.util.*;

public class date{
    public static void main(String[] args){
        
        int minutes, days, months, year, remainingMinutes;

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the time in minutes : ");
        minutes = scn.nextInt();

        year = minutes/525600;
        remainingMinutes = minutes%525600;
        months = remainingMinutes/43800;
        remainingMinutes = remainingMinutes%43800;
        days = remainingMinutes/1440;

        System.out.println(year + "-" + months + "-" + days);
        scn.close();
    }
}