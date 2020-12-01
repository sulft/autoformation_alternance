import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {
    public static void main(String [] args) {
        try {
            File test = new File("test.txt");
            if (test.createNewFile()) {
                System.out.println("File created: " + test.getName());
                test.write("Ce code est me permet d'apprendre à écrire dans un fichier text à l'aide de java");
                test.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}