class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums){
            int noOfDigit = 0;
            while(num > 0){
                num = num / 10;
                noOfDigit++;
            }
            if(noOfDigit % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

// method 2

class Solution {
//100000
    public int findNumbers(int[] nums) {
        int count = 0;
       for (int num: nums){
           if((num >= 10 && num < 100) || (num >= 1000 && num < 10000 || num == 100000)){
               count++;
           }
       }
       return count;
    }
}