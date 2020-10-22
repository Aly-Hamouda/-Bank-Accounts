package testing_codes_by_me;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hi I'm You Lab To Test Your Codes.");
        System.out.println("===================================");

        String filePath = "E:\\Files\\Tester.csv";
        readFile(filePath);
        //String[] names = {"Aly","Mahmoud"};



        //System.out.println(fileContents);

    }

    public static void readFile(String filePath)
    {

        ArrayList<String[]> fileContents = new ArrayList<>();
        String row;


        try (
                FileReader file = new FileReader(filePath);
                BufferedReader br = new BufferedReader(file)
        )
        {
            while ((row = br.readLine()) != null){
                String[] dataRecords = row.split(",");
                fileContents.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Use For Each loop to show the fileContents
        for (String [] out:
                fileContents) {
            for (int i=0; i <out.length;i++) {
                System.out.println(out[i]);
            }
        }
    }

}
