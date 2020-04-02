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

    @Test
    public void intensityTest(){

        int high = 10;
        int low = 0;

        assertTrue("Error, intensity is too high", high >= testExercise.intensity);
        assertTrue("Error, intensity is too low",  low  <= testExercise.intensity);
        System.out.println("Test passed: " + testExercise.intensity + " is within " + high + " and " + low);
    }


}