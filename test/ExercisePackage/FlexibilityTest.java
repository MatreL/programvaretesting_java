package ExercisePackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlexibilityTest {

    @Test
    public void testToString() {

        Flexibility testFlexibility = new Flexibility("Lil p", 5, 30, 3, 5, "Yoga mat");

        assertEquals("Test to check that string equipment works", "Yoga mat", testFlexibility.equipment);
    }

}