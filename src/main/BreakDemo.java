package main;

public class BreakDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                System.out.println("break statement is found");
                break;
            }
            System.out.println("The value of i is "+i);
        }
        System.out.println("Out of the Loop");
    }
}
