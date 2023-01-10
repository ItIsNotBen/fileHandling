import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileHandler {
    private String fileName;

    FileHandler (String fileName) {
        this.fileName = fileName;
    }

    public static void bestWholeFileRead(String fileName) {
        try {
            FileReader fr = new FileReader();
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
