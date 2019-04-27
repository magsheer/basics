/*
    Valid Sudoku
    
    Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be
    validated according to the following rules:

    1.Each row must contain the digits 1-9 without repetition.
    2.Each column must contain the digits 1-9 without repetition.
    3.Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 
    without repetition.
*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        /*
            Other interesting solutions : Maintain a Hashset 
            i/3 j/3 will indicate the boxes
            
            Maintain a 2d array for col, row and block
            [row/col/block][number seen]
            
            block = i/3*3 + j/3
        */
       
        //rows 
        for(int i = 0; i < 9; i++) {
            boolean[] seen = new boolean [9]; 
            for(int j = 0; j < 9; j++) {
            if (board[i][j] != '.'){
            if(seen[(int) (board[i][j] - '1')])
                return false;
            else
                seen[(int) (board[i][j] - '1')] = true;
            }
            }
        }
        
        //columns
        for(int i = 0; i < 9; i++) {
            boolean[] seen = new boolean [9]; 
            for(int j = 0; j < 9; j++) {
            if (board[j][i] != '.'){
            if(seen[(int) (board[j][i] - '1')])
                return false;
            else
                seen[(int)(board[j][i] - '1')] = true;
            }
            }
        }
         
        //blocks
        for(int i = 0; i < 9; i++) {
            int row = (i/3) * 3;
            int col = (i%3) * 3;
            boolean[] seen = new boolean [9];
            for(int j = 0; j < 3; j++) {
                for(int k = 0; k < 3; k++) {
                     if (board[row+j][col+k] != '.'){
                         if(seen[(int) (board[row+j][col+k] - '1')])
                             return false;
                         else
                             seen[(int)(board[row+j][col+k] - '1')] = true;
                     }
                }
            }
        }
            
        return true;
        
    }
}