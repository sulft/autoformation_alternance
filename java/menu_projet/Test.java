
//text package
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.OutputStreamWriter;


public class Test {
    public static void main(String [] args) {
        String text ="choco, lait, oeuf";
        try {
            //FileWriter w = new FileWriter("test.txt", true);
            FileOutputStream oStream = new FileOutputStream("test.txt",true);
            OutputStreamWriter sWriter = new OutputStreamWriter(oStream);
            BufferedWriter bWriter = new BufferedWriter(sWriter);
            sWriter.write("Ce code est me permet d'apprendre à écrire dans un fichier text à l'aide de java\n");
            sWriter.write(text + "\n");
            sWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}