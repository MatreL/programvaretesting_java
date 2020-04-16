package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;


public class PersonTest {
    Person p1;
    Exercise endurance1, strength1, strength2, strength3;
    Program program1, program2;

    // For testing output.. https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        p1 = new Person("Strength",8);
        strength1 = new Strength("Bench press","Bench",2,30,8,4,100);
        strength2 = new Strength("Pull ups", "Pull-up-bar", 9, 15, 10, 5, 15);
        strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);
        endurance1 = new Endurance("Cycling", "Bicycle", 10, 60, 3, 3);

        program1 = new Program("Program one");
        program2 = new Program("Program two");

        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void exerciseIntensityIsCorrect() {
        program1.addExercise(strength1);
        program1.addExercise(strength2);

        assertTrue("Checks that exercises are appropriate for the persons preferred intensity",p1.singleProgramIsAppropriateForPerson(program1));
    }

    @Test
    public void checksBestProgramForPerson() {
        ArrayList<Program> programs = new ArrayList<>();

        program1.addExercise(strength1);
        program1.addExercise(strength2);

        program2.addExercise(strength3);
        program2.addExercise(endurance1);

        programs.add(program1);
        programs.add(program2);

        p1.recommendProgramForSinglePerson(programs);

        assertEquals(p1.getAcceptableProgram(), "Program one");

    }

    @Test
    public void checksScoreFromPreferredExercise() {

        program1.addExercise(strength1);
        program1.addExercise(strength2);
        program1.addExercise(strength3);
        program1.addExercise(endurance1);

        int actual = p1.exerciseIsPreferred(program1);
        int expected = 3;

        // Expects three cases of the type strength in program 1
        assertEquals("Checks score for the times class-type-strength is in program1",expected,actual);
    }


    @Test
    public void alphabeticStrings() {
        boolean isNAN;

        // Creates a regex to include what is allowed in the strings
        String regex = "^[A-Za-z\\s-]+$";

        isNAN = p1.getThePreferredExercise().matches(regex);
        assertTrue("Checking that preferredExercise only contains letters and space", isNAN);
    }

    @Test
    public void stringNotEmpty() {
        boolean stringNotEmpty = true;

        if (p1.getThePreferredExercise().equals("")) {
            stringNotEmpty = false;
        }

        assertTrue("Checking that preferredExercise is not empty", stringNotEmpty);
    }

    @Test
    public void negativeOrEmptyInts() {
        boolean intNotEmpty = true;

        if (p1.getAcceptableIntensity() <= 0) {
            intNotEmpty = false;
        }

        assertTrue("Checking if acceptableIntensity is smaller or equal to 0", intNotEmpty);
    }

    @Test
    public void getsThePreferredExercise() {
        assertEquals("Gets the preferred exercise Strength", "Strength",p1.getThePreferredExercise());
    }

    @Test
    public void testPrintingForNoRecommendedPrograms() {

        program1.addExercise(strength1);
        program1.addExercise(strength2);
        program1.addExercise(strength3);
        program1.addExercise(endurance1);

        ArrayList<Program> programs = new ArrayList<>();

        programs.add(program1);

        p1.recommendProgramForSinglePerson(programs);

        p1.printRecommendProgramForSinglePerson();

        assertEquals("There are no recommended programs..\n", outContent.toString());
    }

    @Test
    public void testingPrintingRecommendedPrograms() {
        program1.addExercise(strength1);
        program1.addExercise(strength2);
        program1.addExercise(strength3);

        ArrayList<Program> programs = new ArrayList<>();
        programs.add(program1);

        p1.recommendProgramForSinglePerson(programs);
        p1.printRecommendProgramForSinglePerson();

        String expected = "The best program is: Program one";

        assertEquals(expected, outContent.toString());
    }

}
