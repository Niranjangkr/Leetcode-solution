class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;
        for(int[] idx: indices){
            int row = idx[0];
            int col = idx[1];

            for(int i = 0; i < n; i++){
                matrix[row][i] += 1;
                if(matrix[row][i] % 2 != 0) count++; //during first iteration it will odd only
                else{ //if during 2nd iteration this position got incremented then it will be even so decrement
                    count--;
                }
            }

            for(int i = 0; i < m; i++){
                matrix[i][col] += 1;
                if(matrix[i][col] % 2 != 0) count++; //during first iteration it will odd only
                else{ //if during 2nd iteration this position got incremented then it will be even so decrement
                    count--;
                }
            }
        }
        return count;
    }
}

// second method

class Solution {
    public int oddCells(int m, int n, int[][] indices) {
      boolean[] oddRow = new boolean[m], oddCol = new boolean[n];
      for (int[] idx: indices){
          oddRow[idx[0]] ^= true;
          oddCol[idx[1]] ^= true;
      }
      int cnt = 0;
      for (int i = 0; i < m; i++){
          for(int j = 0; j < n; j++){
            cnt += oddRow[i] ^ oddCol[j] ? 1 : 0; 
          }
      } 
      return cnt; 
    }
}