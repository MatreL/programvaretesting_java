package ExercisePackage;


import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceTest {

    @Test
    public void testToSting(){

        Balance testBalance = new Balance("Line walk","Slack line", 2,10,15,4);

        assertEquals("Test to check that string equipment works","Slack line",testBalance.equipment );
    }

}
