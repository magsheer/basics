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