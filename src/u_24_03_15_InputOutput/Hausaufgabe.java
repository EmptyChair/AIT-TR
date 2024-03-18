package u_24_03_15_InputOutput;

import java.io.*;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Hausaufgabe {
    public static void main(String[] args) {
        //Minimum - write hello world
        writeHW();
        readHW();

        writeHW_FOS();
        readHW_BuffReader();



    }

    public static void writeHW() {
        try (FileWriter fw = new FileWriter("src\\u_24_03_15_InputOutput\\hw.txt")) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello world!");
            bw.flush();
            System.out.println("HW file was created.");
        } catch (IOException e) {
            System.out.println("Input error!");
        }

    }

    public static void writeHW_FOS () {
        String line = "Hello darkness my old friend...";
        try (FileOutputStream fos = new FileOutputStream("src\\u_24_03_15_InputOutput\\hd.txt")) {
            byte[] buffer = line.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("HD file was created.");
        } catch (IOException e) {
            System.out.println("Input error!");
        }

    }

    public static void readHW () {
        try (FileInputStream fis = new FileInputStream("src\\u_24_03_15_InputOutput\\hw.txt")) {
            System.out.println("Reading file...");
            Scanner s1 = new Scanner(fis);
            while (s1.hasNext()) {
                String line = s1.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Output error!");
        }

    }

    public static void readHW_BuffReader () {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\u_24_03_15_InputOutput\\hd.txt"))) {
            System.out.println("Reading file with Buffered Reader");
            int c;
            while((c=br.read())!=-1) {
                System.out.print((char) c);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
