package Question3;

public class NQueens {
    private int arr[][]; 
    private int dimension; 
    
    NQueens(int dimension){
        if(dimension<1)throw new IllegalArgumentException("Dimension does not exist"); 
        this.dimension = dimension; 
        this.arr = new int[dimension][dimension]; 
        this.solveNQueens();
    }

    private void solveNQueens(){
        if(dimension==2||dimension==3)return; 
        helperSolveNQueens(0);
    }

    private boolean helperSolveNQueens(int x){
        if(x == dimension)return true; 
        for(int i = 0;i<dimension;i++){
            if(validatePosition(x, i)){
                this.arr[x][i] = 1; 
                if(helperSolveNQueens(x+1))return true; 
                this.arr[x][i] = 0; 
            }
        }
        return false; 
    }

    private boolean validatePosition(int x,int y){
        // check column
        for(int i = 0; i<x;i++)if(this.arr[i][y]==1)return false; 
        
        // check upper diagonals 
        int i = x-1; 
        int j = y+1; 
        while(i>=0&&j<dimension){
            if(this.arr[i][j]==1)return false; 
            i--; 
            j++; 
        }
        i = x-1; 
        j = y-1; 
        while(i>=0&&j>=0){
            if(this.arr[i][j]==1)return false; 
            i--; 
            j--; 
        }
        return true; 
    }

    public boolean isPossiable(){
        if(this.dimension==1 || this.dimension>3)return true; 
        return false; 
    }

    public int[][] output(){
        return this.arr; 
    }
}
