package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class ProgramTest {

    Exercise testExercise, strength1, strength2, strength3, flex1, endurance1, balance2;

    @Before
    public void setup() {
        strength1 = new Strength("Bench press","Bench",2,30,8,4,100);
        strength2 = new Strength("Pull ups", "Pull-up-bar", 9, 15, 10, 5, 15);
        strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);
        testExercise = new Exercise("Exercise","workout-clothes", 8, 2, 8,4);

        flex1 = new Flexibility("Shoulder stretch", "Stretch-Out-Strap", 7, 5, 4, 4);
        endurance1 = new Endurance("Cycling", "Bicycle", 10, 60, 3, 3);
        balance2 = new Balance("Headstand","Thick mat", 5, 15, 7, 2);

    }

    @Test
    public void highestIntensity() {
        ArrayList<Exercise> exercises = new ArrayList<>();
        Program testProgram1 = new Program("Test program 2");

        testProgram1.addExercise(strength1);
        testProgram1.addExercise(strength2);
        testProgram1.addExercise(strength3);
        testProgram1.addExercise(testExercise);

        // Expects 9 to be the highest intensity after checking manually in the strength-exercises made in setup()
        assertEquals("Testing to see if the highest intensity in addExercise is working",9, testProgram1.getHighestIntensity());
    }

    @Test
    public void exercisesIsNotBalanced() {
        Program testProgram1 = new Program("Test program 2");

        testProgram1.addExercise(strength1);
        testProgram1.addExercise(strength2);
        testProgram1.addExercise(strength3);
        testProgram1.addExercise(testExercise);

        // Expecting false since the exercises only contains strength and exercise class.
        assertFalse(testProgram1.isBalanced);
    }

    @Test
    public void exercisesIsBalanced() {
        Program testProgram1 = new Program("Test program 2");

        testProgram1.addExercise(strength1);
        testProgram1.addExercise(flex1);
        testProgram1.addExercise(endurance1);
        testProgram1.addExercise(balance2);

        //Expecting true since the exercises contains all four different types of exercises.
        assertTrue(testProgram1.isBalanced);
    }

    @Test
    public void totalDuration() {
        Program testProgram1 = new Program("Test program 2");

        testProgram1.addExercise(strength1);
        testProgram1.addExercise(strength2);
        testProgram1.addExercise(strength3);
        testProgram1.addExercise(testExercise);

        // (30 + 15 + 10 + 2) * 2 = 114
        int expected = 114;

        assertEquals("Checks the total duration", expected, testProgram1.totalDuration());

    }

}
