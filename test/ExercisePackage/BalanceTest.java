package ExercisePackage;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceTest {

    Exercise testBalance;

    @Before
    public void setup() {
        testBalance = new Balance("Line walk","Slack line", 2,10,15,4);
    }

    @Test
    public void testToSting() {

        assertEquals("Test to check that string equipment works","Slack line",testBalance.equipment );
    }

    @Test
    public void testOutput() {
        String expected = "Exercise: Line walk\nIntensity: 2" +
                "\nDuration: 10\nRepetitions: 15 x 4\nEquipment: Slack line";

        // Testing output of print()
        assertEquals("Testing output of print() in balance.java", expected, testBalance.print());
    }

    @Test
    public void testGetType() {
        assertEquals("Expecting Balance to be the output of the function", "Balance", testBalance.getType());
    }

}
