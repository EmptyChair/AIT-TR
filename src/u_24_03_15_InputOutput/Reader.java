package u_24_03_15_InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    // FileInputStream используется для чтения данных из файла.
    // Scanner - полезная обертка для работы с потоками ввода
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("resources\\file.txt")
        ) {
            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()) {
                // reading by line as long as there is data
                String line = scanner.nextLine();
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.print("Entry error");
        }
    }

}
