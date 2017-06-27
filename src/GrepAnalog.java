import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

/**
 * Created by grigoriikutuzov on 22/06/17.
 */
public class GrepAnalog {

    public static void main(String[] args) {

        InputStream is = System.in;
        BufferedReader bf;

        bf = new BufferedReader(new InputStreamReader(is));

        String searchFor = "";

        try {

            System.out.println("Searching for ");
            searchFor = bf.readLine();

        } catch (IOException e) {

            System.out.println(e + " exception occurred");

        }


        GrepFunction gf = new GrepFunction("src/textFile.txt", searchFor);
        gf.grep();

    }

}
