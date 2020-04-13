package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
/*
public class ProgramTest {

    Exercise testExercise, strength1, strength2, strength3;
    Program p1;

    @Before
    public void setup() {
        strength1 = new Strength("Bench press","Bench",2,30,8,4,100);
        strength2 = new Strength("Pull ups", "Pull-up-bar", 9, 15, 10, 5, 15);
        strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);
        testExercise = new Exercise("Exercise","workout-clothes", 8, 2, 8,4);

        p1 = new Program("Test program number 1");

    }

    @Test
    public void highestIntensity() {
        ArrayList<Exercise> exercises = new ArrayList<>();
        Program testProgram1 = new Program("Test program 2");

        exercises.add(strength1);
        exercises.add(strength2);
        exercises.add(strength3);
        exercises.add(testExercise);

        testProgram1.addExercise(exercises);

        // Expects 9 to be the highest intensity after checking manually in the strength-exercises made in setup()
        assertEquals("Testing to see if the highest intensity in addExercise is working",9, testProgram1.getHighestIntensity());
    }

    @Test
    public void exercisesIsBalanced() {
        ArrayList<Exercise> exercises = new ArrayList<>();
        Program testProgram1 = new Program("Test program 2");

        exercises.add(strength1);
        exercises.add(strength2);
        exercises.add(strength3);
        exercises.add(testExercise);

        testProgram1.addExercise(exercises);

        // Expecting false since the exercises only contains strength and exercise class.
        assertFalse(testProgram1.isBalanced);
    }

    @Test
    public void totalDuration() {
        ArrayList<Exercise> exercises = new ArrayList<>();
        Program testProgram1 = new Program("Test program 2");

        exercises.add(strength1);
        exercises.add(strength2);
        exercises.add(strength3);
        exercises.add(testExercise);
        testProgram1.addExercise(exercises);

        // (30 + 15 + 10 + 2) * 2 = 114
        int expected = 114;

        assertEquals("Checks the total duration", expected, testProgram1.getDuration());

    }

}

 */