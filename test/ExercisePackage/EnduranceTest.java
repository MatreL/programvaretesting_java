package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnduranceTest {

    Endurance testEndurance;

    @Before
    public void setup() {
        testEndurance = new Endurance("Lil E", 5, 5, 5, 5,"Shoes");
    }

    @Test
    public void TestToString() {

        assertEquals("Test to check that string equipment works", "Shoes", testEndurance.equipment);
    }
    @Test
    public void intensityTest(){

        int high = 10;
        int low = 0;
        assertTrue("Error, intensity is too high", high >= testEndurance.intensity);
        assertTrue("Error, intensity is too low",  low  <= testEndurance.intensity);
        System.out.println("Test passed: " + testEndurance.intensity + " is within " + high + " and " + low);
    }
    @Test
    public void stringTest(){

        assertNotEquals("", testEndurance.equipment);
    }
}