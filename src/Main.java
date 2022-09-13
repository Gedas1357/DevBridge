import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
            {
                String line = sc.nextLine();
                Pattern pattern = Pattern.compile("[1-9]+[0-9]");
                Matcher matcher = pattern.matcher(line);
                if(matcher.find())
                    System.out.println(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Nerastas test.txt");
        }
        catch(IOException e)
        {
            System.out.println("Negalima perskaityt");
        }

    }
}
