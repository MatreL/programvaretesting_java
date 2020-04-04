package ExercisePackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnduranceTest {

    Endurance testEndurance;

    @Before
    public void setup() {
        testEndurance = new Endurance("Lil E", "Shoes",5, 5, 5, 5);
    }

    @Test
    public void TestToString() {

        assertEquals("Test to check that string equipment works", "Shoes", testEndurance.equipment);
    }

    @Test
    public void stringTest(){

        assertNotEquals("", testEndurance.equipment);
    }
}