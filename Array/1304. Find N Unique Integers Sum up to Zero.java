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

// approach 2

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = i * 2 - n + 1;
        }
        return arr;
    }
}

/**

    second approach is look at the pattern it makes that is the output arry makes an wave like output with constant difference so we just have to increment the array with that difference 
    ie like for:
    n = 5
    -4 -2 0 2 4 
    this is the output array we can have 
    n = 3, [-2, 0, 2]
    n = 4, [-3, -1, 1, 3]
    n = 5, [-4, -2, 0, 2, 4]

    so the it spreads like a wave so the delta or difference here is 2

    so if we use the below rule we get is 
    A[i] = i * 2 - n + 1;
 */

// approach 3

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n % 2 == 0){
             for(int i = 0; i < n; i += 2){
                 arr[i] = i+1;
                 arr[i+1] = -(i+1);
             }
        }else{
            arr[0] = 0;
            for(int i = 1; i < n; i += 2){
                 arr[i] = i+1;
                 arr[i+1] = -(i+1);
             }
        }
        return arr;
    }
}

/**
    also we can do another approach that is in the array we can make pair of each number like below 
    1, -1, 2, -2, 3, -3
    with this we get zero but we cant make this pair when n is odd so for odd what we do is make the first element zero and the rest than can be pairs
 */

