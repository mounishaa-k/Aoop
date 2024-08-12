package Mtwo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
    public void testReverseRegularString() {
        String input = "Module1 Project2";
        String expected = "2tcejorP 1eludoM";
        assertEquals(expected, Utility.reverse(input));
    }

    @Test
    public void testReverseEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, Utility.reverse(input));
    }

    @Test
    public void testReverseStringWithSpecialCharacters() {
        String input = "Module1 @Project2!";
        String expected = "!2tcejorP@ 1eludoM";
        assertEquals(expected, Utility.reverse(input));
    }

    @Test
    public void testHandleNullInput() {
        String input = null;
        assertNull(Utility.reverse(input));
    }

}
