package scrabble;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Enter a word (type 'q' to quit): ");
                String input = br.readLine();
                if (input.equals("q")) {
                    break;
                }
                Scrabble c1 = new Scrabble(input);
                System.out.println(input + " = " + c1.calculateScore() + " points");
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
