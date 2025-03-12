package Question3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests {
    @Test
    public void testNQueensBoardException(){
        assertThrows(IllegalArgumentException.class,()-> new NQueens(-1)); 
    }

    @ParameterizedTest
    @ValueSource(ints = {1,4,5,6,34})
    public void testPossiableBoardDimensions(int dimension){
        NQueens board = new NQueens(dimension); 
        assertTrue(board.isPossiable());
    }

    private static Stream<Arguments> nQueensInputAndResults(){
        return Stream.of(
            Arguments.of(1,new int[][]{{1}}),
            Arguments.of(4,new int[][]{{0,1,0,0},{0,0,0,1},{1,0,0,0},{0,0,1,0}})
        ); 
    }

    @ParameterizedTest
    @MethodSource("nQueensInputAndResults")
    public void testBoardResults(int dimension,int[][]result){
        NQueens board = new NQueens(dimension); 
        assertArrayEquals(result,board.output());
    }
}
