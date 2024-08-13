
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        File file = new File("/home/mohammadtofik/190905514/DataStructureInJava/file1.java");
        Scanner fileReader = new Scanner(file);
        String string = "";
        while (fileReader.hasNextLine()) {
            string = string + fileReader.nextLine();
        }
        System.out.print("The file constains : " + string);
        System.out.println();
        fileReader.close();
    }
}
