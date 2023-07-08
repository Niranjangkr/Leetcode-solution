class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for ( int i = 0; i < nums.length; i++){
            int count = 0; 
            for ( int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }else if( nums[i] > nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}

// second method
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int out[] = new int[101];
        // finding the number of occurence
        for (int i = 0; i < nums.length; i++){
            out[nums[i]]++;   
        }
        // cummulative frequency or to know how many small numbers are there to the left at each position curr num - 1 is the number of small numbers to the current position, making the final output array
        for (int i = 1; i < 101; i++){
            out[i] += out[i -1]; 
        }
        for(int i = 0; i < nums.length; i++){
            int position = nums[i];
            if (position == 0) nums[i] = 0;
            else{
                nums[i] = out[position - 1];
            }
        }
        return nums;
    }
}