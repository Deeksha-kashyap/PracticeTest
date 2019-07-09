package main;

public class BreakDemo2 {
    public static void main(String[] args) {
        outer:
        for(int i=0; i<5; i++)
        {
            while (true)
            {
                System.out.println("Hello");
                break;    //outer;
            }
        }
        System.out.println("Good-Bye");
    }
}
