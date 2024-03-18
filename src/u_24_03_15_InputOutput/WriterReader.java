package u_24_03_15_InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriterReader {
    public static void main(String[] args) {
        //WRITE
        try (FileWriter fw = new FileWriter("resources\\file2.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello world!"); // Записываем строку в файл
            bw.flush();
            bw.newLine(); // Добавляем новую строку
            bw.write("Goodbye, cruel world!");
            bw.flush();
            System.out.println("File has been written.");
        } catch (IOException e) {
            System.out.print("I/O error!");
        }

        //READ
        try (
                FileInputStream fis = new FileInputStream("resources\\file2.txt")
        ) {
            System.out.println("Reading file...");
            Scanner scanner = new Scanner(fis);

            while(scanner.hasNext()) {
                // reading by line as long as there is data
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.print("Entry error");
        }

    }
}
