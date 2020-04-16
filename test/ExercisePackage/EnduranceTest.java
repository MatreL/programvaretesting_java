package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnduranceTest {

    Endurance testEndurance;

    @Before
    public void setup() {
        testEndurance = new Endurance("Running", "Shoes",5, 5, 5, 5);
    }

    @Test
    public void TestToString() {
        assertEquals("Test to check that string equipment works", "Shoes", testEndurance.equipment);
    }

    @Test
    public void stringTest() {
        assertNotEquals("", testEndurance.equipment);
    }

    @Test
    public void testOutput() {
        String output = "Exercise: Running\nIntensity: 5" +
                "\nDuration: 5\nRepetitions: 5 x 5\nEquipment: Shoes";

        assertEquals("Testing output of print in endurance", output, testEndurance.print());
    }

    @Test
    public void testGetType() {
        assertEquals("Testing that getType displays Endurance","Endurance",testEndurance.getType());
    }

}