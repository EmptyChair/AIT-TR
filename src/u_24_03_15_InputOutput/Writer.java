package u_24_03_15_InputOutput;

import java.io.BufferedWriter;

import java.io.FileWriter;

import java.io.IOException;



// BufferedWriter используется для буферизированной записи

// текста в файл. Метод write() используется для записи

// текста, а newLine() для добавления новой строки.

public class Writer {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("resources\\output.txt")) {

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Привет, мир!"); // Записываем строку в файл

            bw.newLine(); // Добавляем новую строку

            bw.write("До свидания, мир!");

        } catch (IOException e) {

            System.out.print("Ошибка ввода вывода");

        }

    }

}