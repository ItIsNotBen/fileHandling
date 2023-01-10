import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
    public static void bestWholeFileRead() {
        try {
            FileReader fr = new FileReader("input_file.txt");
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

    public static void main(String[] args) {
        bestWholeFileRead();
    }
}
