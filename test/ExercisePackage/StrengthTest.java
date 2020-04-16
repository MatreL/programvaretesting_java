package ExercisePackage;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StrengthTest {

    Strength testStrength;

    @Before
    public void setup() {
        testStrength = new Strength("Incline bench", "Manuals",10,60,7,3,17.5);
    }

    // Test made aware of weightsInKg to be an int, when wanted to be a double datatype
    @Test
    public void testToString() {
        assertEquals("To see if i could use decimal-numbers",17.5, testStrength.weightsInKg, .01);
    }

    @Test
    public void testPrint() {
        String output = "Exercise: Incline bench\nIntensity: 10" +
                "\nDuration: 60\nRepetitions: 7 x 3\nEquipment: Manuals\nWeights: 17.5";
        assertEquals("Checking output from print in Strength", output, testStrength.print());
    }

    @Test
    public void testGetType() {
        assertEquals("Checking that we get Strength from getType","Strength", testStrength.getType() );
    }



}