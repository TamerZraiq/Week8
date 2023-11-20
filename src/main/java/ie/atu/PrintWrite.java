package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWrite {
    public static void main(String[] args) {

        String fileName = "File13.txt";
        File myFile = new File (fileName);

        try(PrintWriter writer = new PrintWriter(new FileWriter(myFile, true))) {
            writer.println("Hello");
            writer.println("My Name is Tamer");
            writer.close();
            System.out.println("Text added to file successfully");


        }
        catch(IOException e){
            System.out.println("An error occured while creating the file");

        }
    }
}
