package by.example.senla.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter x");
            int x = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Please enter y");
            int y = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Least common multiple: " + findLeastCommonMultiple(Math.abs(x), Math.abs(y)));
            System.out.println("Greatest common divisor: " + findGreatestCommonDivisor(Math.abs(x), Math.abs(y)));
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findLeastCommonMultiple(int x, int y) {
        return x / findGreatestCommonDivisor(x, y) * y;
    }

    private static int findGreatestCommonDivisor(int x, int y) {
        return y == 0 ? x : findGreatestCommonDivisor(y, x % y);
    }
}
