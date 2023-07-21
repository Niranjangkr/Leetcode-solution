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
