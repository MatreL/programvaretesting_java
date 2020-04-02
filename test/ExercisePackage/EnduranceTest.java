package ExercisePackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnduranceTest {

    @Test
    public void TestToString() {

        Endurance testEndurance = new Endurance("Lil E", 5, 30, 3, 5, "Running Shoes");

        assertEquals("Test to check that string equipment works", "Running Shoes", testEndurance.equipment);
    }
    @Test
    public void intensityTest(){

        Endurance testEndurance = new Endurance("Lil E", 11, 5, 5, 5,"Shoes");

        int high = 10;
        int low = 0;
        assertTrue("Error, intensity is too high", high >= testEndurance.intensity);
        assertTrue("Error, intensity is too low",  low  <= testEndurance.intensity);
        System.out.println("Test passed: " + testEndurance.intensity + " is within " + high + " and " + low);
    }
    @Test
    public void stringTest(){


        Endurance testEndurance = new Endurance("Lil E", 11, 5, 5, 5,"Shoes");

        assertNotEquals("", testEndurance.equipment);
    }
}