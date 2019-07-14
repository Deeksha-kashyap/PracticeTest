package main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class DisplayData {
    public static void main(String[] args) {
        try
        {
            URL url=new URL("https://github.com/Deeksha-kashyap/C-sharp-Programs");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
