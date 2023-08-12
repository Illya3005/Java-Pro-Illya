package HW6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class SymbolCounterTest {

    @Test
    public void testFindSymbolOccurance() {
        String input = "Nobody dies a virgin... Life fucks us all";
        char symbol = 'o';
        int expectedOccurrences = 4;
        int actualOccurrences = SymbolCounter.findSymbolOccurance(input, symbol);
        assertEquals(expectedOccurrences, actualOccurrences);
    }
}
