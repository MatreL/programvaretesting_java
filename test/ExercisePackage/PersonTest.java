package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person p1;

    @Before
    public void setup() {
        p1 = new Person("Strength",8,10);
    }

    @Test
    public void alphabeticStrings() {
        boolean isNAN;

        // Creates a regex to include what is allowed in the strings
        String regex = "^[A-Za-z\\s-]+$";

        isNAN = p1.preferredExercise.matches(regex);
        assertTrue("Checking that preferredExercise only contains letters and space", isNAN);
    }

    @Test
    public void stringNotEmpty() {
        boolean stringNotEmpty = true;

        if (p1.preferredExercise.equals("")) {
            stringNotEmpty = false;
        }

        assertTrue("Checking that preferredExercise is not empty", stringNotEmpty);
    }

    @Test
    public void checksNegativeIntsOrEmpty() {
        boolean intNotEmpty = true;

        if (p1.acceptableIntensity <= 0) {
            intNotEmpty = false;
        }

        assertTrue("Checking if acceptableIntensity is smaller or equal to 0", intNotEmpty);
    }

}
