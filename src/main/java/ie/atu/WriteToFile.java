package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {

        String fileName = "File13. txt";

        try(FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("Hello\n");
            writer.write("My Name is Tamer");
            writer.close();
            System.out.println("Text added to file successfully");


        }catch(IOException e){
            System.out.println("An error occured while creating the file");

        }
    }
}
