package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class PersonTest {
    Person p1;
    Exercise endurance1, strength1, strength2, strength3;
    Program program1, program2;

    @Before
    public void setup() {
        p1 = new Person("Strength",8);
        strength1 = new Strength("Bench press","Bench",2,30,8,4,100);
        strength2 = new Strength("Pull ups", "Pull-up-bar", 9, 15, 10, 5, 15);
        strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);
        endurance1 = new Endurance("Cycling", "Bicycle", 10, 60, 3, 3);

        program1 = new Program("Program one");
        program2 = new Program("Program two");
    }

    @Test
    public void exerciseIntensityIsCorrect() {
        program1.addExercise(strength1);
        program1.addExercise(strength2);

        assertTrue("Checks that exercises are appropriate for the persons preferred intensity",p1.singleProgramIsAppropiateForPerson(program1));
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

        assertEquals(p1.reccomendProgramForSinglePerson(programs), "The best program is: Program one");

    }

    @Test
    public void checksScoreFromPreferredExercise() {

        program1.addExercise(strength1);
        program1.addExercise(strength2);
        program1.addExercise(strength3);
        program1.addExercise(endurance1);

        int actual = p1.exerciseIsPreffered(program1);
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


}
