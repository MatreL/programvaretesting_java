package ExercisePackage;


import org.junit.Test;

import static org.junit.Assert.*;

public class BalanceTest {

    @Test
    public void testToSting(){

        Balance testBalance = new Balance("Alex","Fitness ball", 2,10,15,4);

        assertEquals("Test to check that string equipment works","Fitness ball",testBalance.equipment );
    }

}
