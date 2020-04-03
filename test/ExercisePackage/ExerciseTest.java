package ExercisePackage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseTest {

    Exercise testExercise;

    @Before
    public void setup() {
        testExercise = new Exercise("Exercise", 7, 30, 8,4);
    }

    @Test
    public void printExercise() {
    }

    @Test
    public void testToString() {
    }

    // Checking if intensity is between 0 and 10
    @Test
    public void intensityTest(){

        int high = 10;
        int low = 0;

        assertTrue("Error, intensity is too high", high >= testExercise.intensity);
        assertTrue("Error, intensity is too low",  low  <= testExercise.intensity);
        System.out.println("Test passed: " + testExercise.intensity + " is within " + high + " and " + low);
    }

    // Checking if name is empty
    @Test
    public void nameNotEmpty() {
        stringIsEmpty(testExercise.name);
    }

    @Test
    public void intNotEmpty() {
        intIsEmpty(testExercise.intensity);
        intIsEmpty(testExercise.duration);
        intIsEmpty(testExercise.repetitions);
        intIsEmpty(testExercise.sets);
    }

    // Method to check if a string is empty
    public void stringIsEmpty(String a) {

        boolean nameNotEmpty = true;

        if (a.equals("")) {
            nameNotEmpty = false;
        }
        assertTrue("Check if string is empty",nameNotEmpty);
    }

    // Method to check if an int is empty
    public void intIsEmpty(int a) {

        boolean intNotEmpty = true;

        if (a == 0) {
            intNotEmpty = false;
        }
        assertTrue("Check if int is empty",intNotEmpty);
    }


}