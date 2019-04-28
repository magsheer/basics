/*
    Rotate Image

    You are given an n x n 2D matrix representing an image.
    Rotate the image by 90 degrees (clockwise).

    credits - @hashb
*/

class Rotate2DArray {
    public void rotate(int[][] matrix) {
        int n =  matrix.length;
        int size = n - 1; //number of rows
        
        for (int i = 0; i < n/2; i++) {
            rotateLayer(matrix, i, size);
            size = size - 2; //inner layer so -> minus the outer rows/columns
        }
    }
    
    public void rotateLayer(int[][] matrix, int idx, int size) {
        
        for(int k = 0; k < size; k++) {

            int temp = matrix[idx][idx + k]; // the first element during the first iteration
            
            matrix[idx][idx + k] = matrix[size + idx - k][idx];     // 1 = 4 

            matrix[size + idx - k][idx] = matrix[size + idx - 0][size + idx - k]; // 4 = 3

            matrix[size + idx - 0][size + idx - k] = matrix[idx + k][size + idx - 0]; // 3 = 2

            matrix[idx + k][size + idx - 0] = temp;

        }
    }
}