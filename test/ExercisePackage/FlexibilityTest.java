package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlexibilityTest {

    Flexibility testFlexibility;

    @Before
    public void setup() {
        testFlexibility = new Flexibility("Lil p", 5, 30, 3, 5, "Yoga mat");
    }

    @Test
    public void testToString() {
        assertEquals("Test to check that string equipment works", "Yoga mat", testFlexibility.equipment);
    }

}