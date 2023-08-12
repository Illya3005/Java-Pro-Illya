package HW6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {



         @Test
        public void testStringReverse() {
            String input = "Hello, world!";
            String expected = "!dlrow ,olleH";
            String actual = Reverse.stringReverse(input);
            assertEquals(expected, actual);
        }
    }

