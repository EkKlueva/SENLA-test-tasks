package by.example.senla.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter text");
        String text = bufferedReader.readLine();

        text = text.trim().replaceAll("\\s+", " ");
        text = capitalizeTheFirstLetterOfEachWord(text);

        System.out.println("Number of words in text: " + findTheNumberOfWords(text));

        String[] words = sortWords(text);

        System.out.print("Sorted words:");
        for (String word : words) {
            System.out.print(" " + word);
        }
    }

    private static String capitalizeTheFirstLetterOfEachWord(String text) {
        StringBuilder builder = new StringBuilder(text);

        builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        for (int i = 1; i < text.length(); i++) {
            if (Character.isSpaceChar(text.charAt(i - 1))) {
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));
            }
        }

        return builder.toString();
    }

    private static int findTheNumberOfWords(String text) {
        String[] words = text.split(" ");
        return words.length;
    }

    private static String[] sortWords(String text) {
        String[] words = text.split(" ");
        Arrays.sort(words);
        return words;
    }
}
