package main;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int b=1,a,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        n=scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            a=b;
            for (int j = 1; j <=i ; j++) {
                System.out.println(a);
                a--;
            }
        }
    }
}
