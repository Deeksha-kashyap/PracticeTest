package main;

import java.net.URL;

public class DisplayData {
    public static void main(String[] args) {
        try
        {
            URL url=new URL("https://github.com/Deeksha-kashyap/C-sharp-Programs");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
