package scrabble;

import java.util.*;

public class Scrabble {

    private String input;

    public Scrabble (String input) {
        this.input = input;
    }

    public int calculateScore () {
        Map<Character, Integer> wordValues = new HashMap<Character, Integer>();
        wordValues.put('A',1);
        wordValues.put('E',1);
        wordValues.put('I',1);
        wordValues.put('O',1);
        wordValues.put('U',1);
        wordValues.put('L',1);
        wordValues.put('N',1);
        wordValues.put('R',1);
        wordValues.put('S',1);
        wordValues.put('T',1);
        wordValues.put('D',2);
        wordValues.put('G',2);
        wordValues.put('B',3);
        wordValues.put('C',3);
        wordValues.put('M',3);
        wordValues.put('P',3);
        wordValues.put('F',4);
        wordValues.put('H',4);
        wordValues.put('V',4);
        wordValues.put('W',4);
        wordValues.put('Y',4);
        wordValues.put('K',5);
        wordValues.put('J',8);
        wordValues.put('X',8);
        wordValues.put('Q',10);
        wordValues.put('Z',10);

        int score = 0;
        String word = this.input.toUpperCase();

        for (int i =0; i < word.length(); i++) {
            if (wordValues.get(word.charAt(i)) != null) {
                score = wordValues.get(word.charAt(i)) + score;
            }
        }
        return score;
    }

}
