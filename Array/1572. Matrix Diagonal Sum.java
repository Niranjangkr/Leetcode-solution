class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int count = 0;
        for(int col = 0; col < n; col++){
            int Srow = col;
            int Erow = n - col - 1;
            
            if(n == 1){
                return mat[0][0];
            }

            if(Srow == Erow){
                count += mat[Srow][col];
            }else{
                count += mat[Srow][col] + mat[Erow][col];
            }
        }
        return count;       
    }
}

