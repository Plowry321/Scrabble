package scrabble;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void calculateScore_SixLetterWord() {
        Scrabble c1 = new Scrabble("accept");
        assertEquals(12, c1.calculateScore());
    }

    @Test
    void calculateScore_LongWord() {
        Scrabble c1 = new Scrabble("Impedimenta");
        assertEquals(18, c1.calculateScore());
    }

    @Test
    void calculateScore_ShortWord() {
        Scrabble c1 = new Scrabble("The");
        assertEquals(6, c1.calculateScore());
    }

    @Test
    void calculateScore_OneLetterWord() {
        Scrabble c1 = new Scrabble("A");
        assertEquals(1, c1.calculateScore());
    }

    @Test
    void calculateScore_SymbolWord() {
        Scrabble c1 = new Scrabble("Hello!");
        assertEquals(8, c1.calculateScore());
    }

    @Test
    void calculateScore_EmptyString() {
        Scrabble c1 = new Scrabble("");
        assertEquals(0,c1.calculateScore());
    }

    @Test
    void calculateScore_Uppercase_Lowercase() {
        Scrabble c1 = new Scrabble("HELLO"); //ALL UPPERCASE
        Scrabble c2 = new Scrabble("hello"); //all lowercase
        assertEquals(c1.calculateScore(),c2.calculateScore());
    }


}