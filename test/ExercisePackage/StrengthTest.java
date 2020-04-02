package ExercisePackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrengthTest {

    @Test
    public void testToString() {

        Strength testStrength = new Strength(10,60,7,3,17.5,"Manuals");

        assertEquals("To see if i could use decimal-numbers",17.5, testStrength.weightsInKg, .01);

    }
}