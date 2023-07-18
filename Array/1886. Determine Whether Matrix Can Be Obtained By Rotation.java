class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // check if both are same or different and if true return true
        // first rotate
        // check with the output array and keep on updating the true or false if true return immediately
        // only rotate for three times as for forth time it will come back to its original form
        // return true of false

        boolean result = false;
        result = check(mat, target);
        if(result) return result;
        // only three rotation
        for(int i = 0; i < 3; i++){
            mat = rotate(mat);
            result = check(mat, target);
            if(result) return result;
        }
        return false;
    }
    private boolean check(int[][] mat, int[][] target){
       boolean result = true;
       for(int i = 0; i < mat.length; i++){
           for(int j = 0; j < mat[i].length; j++){
               if(mat[i][j] != target[i][j]){
                   return false;
               }
           }
       }
       return true;
    }

    private int[][] rotate(int[][] mat){
    //    first transpose the matrix 
    //    then reverse the rows of transposed matrix
        int n = mat.length;
        int[][] newMat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                newMat[i][j] = mat[n-j-1][i];
            }
        }
        return newMat;
    }

}