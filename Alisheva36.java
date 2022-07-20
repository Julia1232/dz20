package lesson19.lesson20;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Alisheva36 {
    public static void main(String[] args)  {
        File file=new File("test");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        String line =scanner.nextLine();
        String[] numberString = line.split("");
        int[] numbers = new int[4];
        int counter = 0;

        for(String number : numberString){
            numbers[counter++]=Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
