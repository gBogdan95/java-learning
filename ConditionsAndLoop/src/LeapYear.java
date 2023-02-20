import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Insert the year");
        int year = s.nextInt();

        if(year % 100 == 0 && year % 400 != 0)
            System.out.println("The year " + year + "  is not leap");
        else if (year % 4 == 0)
            System.out.println("The year " + year + " is leap");
        else
            System.out.println("The year " + year + " is not leap");
    }
}
