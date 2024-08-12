package Mone;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        outputStreamCaptor.reset();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testMilk() {
        Coffee milk = new Milk();
        milk.make();
        assertEquals("Added Milk!", outputStreamCaptor.toString().trim());
    }

   

    @Test
    void testWhip() {
        Coffee whip = new Whip();
        whip.make();
        assertEquals("Added Whip!", outputStreamCaptor.toString().trim());
    }
    @Test
    void testSugar() {
        Coffee sugar = new Sugar();
        sugar.make();
        assertEquals("Added Sugar!", outputStreamCaptor.toString().trim());
    }    
}
