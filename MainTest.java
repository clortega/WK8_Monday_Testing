// import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;


public class MainTest {



    @Test
    public void testIsPrimeTrue() {
        //Arrange

        //Act
        boolean output = Main.IsPrime(5);

        //Assert
        // assertEquals(output, true);
        assertTrue(output);
    }

    @Test
    public void testIsPrimeFalse() {
        //Arrange

        //Act
        boolean output = Main.IsPrime(4);

        //Assert
        // assertEquals(output, true);
        assertFalse(output);
    }        
 
    
    @Test
    public void testIsPrimeNumber1() {
        //Arrange

        //Act
        boolean output = Main.IsPrime(1);

        //Assert
        // assertEquals(output, true);
        assertFalse(output);
    }
    
    @Test
    public void testIsPrimeNegativeNumber() {
        //Arrange

        //Act
        boolean output = Main.IsPrime(-1);

        //Assert
        // assertEquals(output, true);
        assertFalse(output);
    }

    @Test(expected=NullPointerException.class)
    public void nullPointerSpecial2023() {
        Main.Special(2023);
    }

    
}

