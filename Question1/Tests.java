package Question1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Tests {
    @Test
    public void testLCM(){
        assertThrows(IllegalArgumentException.class,()->Calculator.calculateLCM(-1, 2)); 
        
        assertEquals(30,Calculator.calculateLCM(15,10));
        
        assertEquals(0,Calculator.calculateLCM(15,0));
    }
    
    @Test
    public void testHCF(){
        assertThrows(IllegalArgumentException.class,()->Calculator.calculateHCF(-1, 2)); 
        
        assertEquals(5,Calculator.calculateHCF(15,10));
        
        assertEquals(15,Calculator.calculateHCF(15,0));
    }
}
