package main;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Enter Yr Day");
        Scanner sc=new Scanner(System.in);
        String day=sc.nextLine();

        switch(day)
        {
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            default:
                System.out.println("Your choice is not decent");
        }
        System.out.println("Out of the switch block.");
    }
}
