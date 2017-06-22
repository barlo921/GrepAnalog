import java.util.Iterator;

/**
 * Created by grigoriikutuzov on 22/06/17.
 */
public class GrepAnalog {

    public static void main(String[] args) {

        GrepFunction gf = new GrepFunction("src/textFile.txt", "Pine");
        gf.grep();

    }

}
