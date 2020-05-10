package by.example.senla.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter N");
        try {
            int N = Integer.parseInt(bufferedReader.readLine());
            if (N > 100 || N < 0) {
                System.out.println("Incorrect input!");
            } else {
                int[] palindromes = findPalindromes(N);
                System.out.print("Palindromes:");
                for (int number: palindromes) {
                    System.out.print(" " + number);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] findPalindromes(int N) {
        int[] palindromes = new int[N + 1];
        int counter = 0;
        for (int i = 0; i < N + 1; i++) {
            if (i < 10 || i % 10 == i / 10) {
                palindromes[counter] = i;
                counter++;
            }
        }
        int[] array = new int[counter];
        System.arraycopy(palindromes, 0, array, 0, counter);
        return array;
    }
}
