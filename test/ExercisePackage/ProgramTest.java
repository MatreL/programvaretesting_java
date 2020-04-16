package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
public class ProgramTest {

    Exercise strength1, strength2, strength3, flex1, endurance1, balance2;
    Program testProgram1;

    // For testing output.. https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        strength1 = new Strength("Bench press","Bench",2,30,8,4,100);
        strength2 = new Strength("Pull ups", "Pull-up-bar", 9, 15, 10, 5, 15);
        strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);

        flex1 = new Flexibility("Shoulder stretch", "Stretch-Out-Strap", 7, 5, 4, 4);
        endurance1 = new Endurance("Cycling", "Bicycle", 10, 60, 3, 3);
        balance2 = new Balance("Headstand","Thick mat", 5, 15, 7, 2);
        testProgram1 = new Program("Test program 2");

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void highestIntensity() {
        testProgram1.addExercise(strength1);
        testProgram1.addExercise(strength2);
        testProgram1.addExercise(strength3);
        testProgram1.addExercise(balance2);

        // Expects 9 to be the highest intensity after checking manually in the strength-exercises made in setup()
        assertEquals("Testing to see if the highest intensity in addExercise is working",9, testProgram1.getHighestIntensity());
    }

    @Test
    public void exercisesIsNotBalanced() {
        Program testProgram1 = new Program("Test program 2");

        testProgram1.addExercise(strength1);
        testProgram1.addExercise(strength2);
        testProgram1.addExercise(strength3);
        testProgram1.addExercise(balance2);

        // Expecting false since the exercises only contains strength and exercise class.
        assertFalse(testProgram1.isBalanced);
    }

    @Test
    public void sortByIntensity() {
        Program testProgram1 = new Program("Test program 2");

        testProgram1.addExercise(strength1);
        testProgram1.addExercise(flex1);
        testProgram1.addExercise(endurance1);
        testProgram1.addExercise(balance2);

        testProgram1.sortExercise();

        var testExercises = testProgram1.getExercises();

        boolean intensityIsSorted = true;

        for (int i = 0; i < testExercises.size() - 1; i++) {
            if (testExercises.get(i).intensity < testExercises.get(i + 1).intensity) {
                break;
            } else {
                intensityIsSorted = false;
            }
        }

        assertTrue("Tests that the array list is sorted by intensity", intensityIsSorted);
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
        testProgram1.addExercise(balance2);

        // (30 + 15 + 10 + 15) * 2 = 140
        int expected = 140;

        assertEquals("Checks the total duration", expected, testProgram1.totalDuration());
    }

    @Test
    public void checksPrintOfBalance() {

        Program testProgram = new Program("Program number two");

        testProgram.addExercise(strength1);
        testProgram.addExercise(flex1);
        testProgram.addExercise(balance2);
        testProgram.addExercise(endurance1);

        String expected = "The program is balanced";

        // Expects program to be balanced
        assertEquals("Expects program to print that it is balanced", expected, testProgram.printIsBalanced());
    }

    @Test
    public void checksAndPrintsIfProgramIsNotBalanced() {
        Program testProgram = new Program("Program number two");

        testProgram.addExercise(strength1);
        testProgram.addExercise(flex1);
        testProgram.addExercise(balance2);

        String expected = "The program is not balanced";

        // Expects program to be unbalanced
        assertEquals("Expects program to print that it is not balanced", expected, testProgram.printIsBalanced());
    }

    @Test
    public void testsThatHasExercise() {
        Program testProgram = new Program("Program number two");
        testProgram.addExercise(strength1);

        assertTrue("Tests to see if test program contains strength",testProgram.hasExercise("Strength"));
    }

    @Test
    public void testsPrint() {
        testProgram1.addExercise(strength1);
        testProgram1.addExercise(strength2);
        testProgram1.addExercise(strength3);
        testProgram1.addExercise(balance2);
        testProgram1.print();

        String expected = "The name of the program is \n" +
                "Test program 2\n" +
                "And this is the exercises: \n" +
                "Exercise: Bench press\n" +
                "Intensity: 2\n" +
                "Duration: 30\n" +
                "Repetitions: 8 x 4\n" +
                "Equipment: Bench\n" +
                "Weights: 100.0\n" +
                "\n" +
                "Exercise: Headstand\n" +
                "Intensity: 5\n" +
                "Duration: 15\n" +
                "Repetitions: 7 x 2\n" +
                "Equipment: Thick mat\n" +
                "\n" +
                "Exercise: Biceps curl\n" +
                "Intensity: 7\n" +
                "Duration: 10\n" +
                "Repetitions: 10 x 3\n" +
                "Equipment: Manuals\n" +
                "Weights: 22.5\n" +
                "\n" +
                "Exercise: Pull ups\n" +
                "Intensity: 9\n" +
                "Duration: 15\n" +
                "Repetitions: 10 x 5\n" +
                "Equipment: Pull-up-bar\n" +
                "Weights: 15.0\n" +
                "\n" +
                "This is the total duration: 140\n" +
                "The program is not balanced\n" +
                "The highest intensity is: 9\n\n\n";

        assertEquals(expected, outContent.toString());
    }

}
