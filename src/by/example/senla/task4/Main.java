package by.example.senla.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter text");
        String text = bufferedReader.readLine();

        System.out.println("Please enter word");
        String word = bufferedReader.readLine();

        System.out.println(findTheNumberOfOccurrences(text, word));
    }

    private static int findTheNumberOfOccurrences(String text, String word) {
        text = text.trim().replaceAll("\\s+", " ");
        String[] words = text.split(" ");
        int counter = 0;
        for (String wordInText: words) {
            if (wordInText.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        return counter;
    }
}
