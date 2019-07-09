package main;

//This demo is for labeled continue statement
public class ContinueDemo2 {
    public static void main(String[] args) {
        outer:
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                System.out.println("Hello");
                continue;     //outer;
            }
        }
        System.out.println("Good-Bye");
    }
}
