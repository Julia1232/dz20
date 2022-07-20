package lesson19.lesson20;

import java.io.IOException;
import java.util.Scanner;

public class Alisheva38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Пользователь ввел не 0");
                }
            }
        }
    }
}
