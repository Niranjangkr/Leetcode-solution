class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n == 1){
            arr[0] = 0;
            return arr;
        }
        if(n % 2 == 0){
            return arr = even(n, arr);
        }else{
            return arr = odd(n, arr);
        }
    }

    public int[] odd(int n, int[] arr){
         int mid = n/2;
         int neg = mid + 1;
         int pos = 1;
         for (int i = 0; i <= mid; i++){
            arr[i] = -(neg);
            neg--;
         }
         for (int i = mid+1; i < n; i++){
             if(i == n -1){
                 arr[i] = n;
             }else{
                 arr[i] = pos;
                 pos++; 
             }
         }
         return arr;
    }

    public int[] even(int n, int[] arr){
         int mid = n/2;
         int neg = mid;
         int pos = 1;
         for (int i = 0; i < mid; i++){
            arr[i] = -(neg);
            neg--;
         }
         for (int i = mid; i < n; i++){
                 arr[i] = pos;
                 pos++; 
         }
         return arr;
    }

}

/**
  take the mid point or find the mid point
  first traverse throught the entire array 
  in the array 
  if odd number of places than 
    - till 0 index to mid point give -ve numbers starting from mid+1 number 
    - till mid+1 index to n.length -1 give positive number
    - starting from 1 , 2, 3 like this only thing the last index should have value of n; 
 */