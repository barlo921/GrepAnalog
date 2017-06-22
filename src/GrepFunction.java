import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by grigoriikutuzov on 22/06/17.
 */
public class GrepFunction {

    private ArrayList <String> grepData;
    private String fileName;
    private CharSequence searchFor;

    public GrepFunction (String fileName, CharSequence searchFor){

        this.fileName = fileName;
        this.searchFor = searchFor;

    }

    public void grep() {

        ReadFile rf = new ReadFile(fileName);

        Iterator it = rf.getData().iterator();

        String tempData;

        while (it.hasNext()){

            if ((tempData = it.next().toString()).contains(searchFor)) {

                System.out.println(tempData);

            }

        }


    }

}
