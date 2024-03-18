package u_24_03_15_InputOutput;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class myReader {

    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("\\resources\\file2.txt")) {
            int i;
            do {
                i = stream.read();

                if (i == -1)
                    break;
                System.out.println("i");
            } while(true);
        } catch (IOException e ){

        }
    }
}
