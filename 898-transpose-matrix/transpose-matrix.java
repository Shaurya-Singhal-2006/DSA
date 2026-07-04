class Solution {
    public int[][] transpose(int[][] matrix) {
        int xlen = matrix.length;
        int ylen = matrix[0].length;    
        int[][] newMatrix = new int[ylen][xlen];
        for(int i = 0 ; i < ylen ; i++){
            for(int j = 0 ; j < xlen ; j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }
}