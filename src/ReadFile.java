/**
 * Created by grigoriikutuzov on 22/06/17.
 */

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {

    private BufferedReader reader = null;
    private String fileName;
    private ArrayList <String> data;

    public ReadFile(String fileName) {

        this.fileName = fileName;

    }



    public ArrayList<String> getData(){

        String tempLine;
        data = new ArrayList<String>();


        try {

            reader = new BufferedReader(new FileReader(fileName));

            while ((tempLine = reader.readLine()) != null) {

                data.add(tempLine);
            }


        } catch (IOException e) {

            System.out.println(e + "exception occurred when reading file.");

            if (e == new FileNotFoundException()) {

                System.out.println("File " + fileName + " not found");

            }

        }

        return data;

    }


}
