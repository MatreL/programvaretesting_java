package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlexibilityTest {

    Flexibility testFlexibility;

    @Before
    public void setup() {
        testFlexibility = new Flexibility("Stretching", "Yoga mat", 5, 30, 3, 5);
    }

    @Test
    public void testToString() {
        assertEquals("Test to check that string equipment works", "Yoga mat", testFlexibility.equipment);
    }

    @Test
    public void testOutput() {

        String expected = "Exercise: Stretching\nIntensity: 5" +
                "\nDuration: 30\nRepetitions: 3 x 5\nEquipment: Yoga mat";

        //Testing output of the program
        assertEquals("Testing print() to display the right output",expected, testFlexibility.print());

    }

    @Test
    public void testGetType() {
        assertEquals("Testing getType() to return Flexibility","Flexibility", testFlexibility.getType());
    }

}