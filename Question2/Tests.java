package Question2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Tests {
    @Test
    public void testLinearSearch(){
        assertThrows(IllegalArgumentException.class, ()->Search.linearSearch(new int[]{}, 6));

        assertEquals(3,Search.linearSearch(new int[]{2,3,1,6,3,4}, 6));
    }   
    @Test
    public void testBinarySearch(){
        assertThrows(IllegalArgumentException.class, ()->Search.binarySearch(new int[]{}, 6));
        
        assertThrows(IllegalArgumentException.class, ()->Search.binarySearch(new int[]{1,4,2,5,6}, 6));

        assertEquals(2,Search.binarySearch(new int[]{1,2,3,6,8,9}, 3));
    }
}
