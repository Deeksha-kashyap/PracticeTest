package main;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                System.out.println("Continue statement is found");
                continue;
            }
            System.out.println("The value of i is "+i);

        }
    }
}
