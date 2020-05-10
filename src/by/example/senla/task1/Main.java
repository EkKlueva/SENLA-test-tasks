package by.example.senla.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number");
        try {
            int x = Integer.parseInt(bufferedReader.readLine());

            System.out.println(determineEvenOrOddNumber(x));
            System.out.println(determinePrimeOrCompositeNumber(x));
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String determineEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    private static String determinePrimeOrCompositeNumber(int number) {
        if (number < 2) {
            return "Neither prime nor composite";
        }
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}
