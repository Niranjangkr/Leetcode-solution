class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
            int sum = 0;
            for(int j = i + 1; j < nums.length ; j++){
                sum = nums[i] + nums[j];
                if (sum == target){
                    out[0] = i;
                    out[1] = j;
                    return out;
                }
            }
        }
        out[0] = -1;
        out[1] = -1;
        return out;
    }
}

// approach 2

class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int result[] = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < numbers.length; i++){
        if(map.containsKey(target - numbers[i])){
            result[1] = i;
            result[0] = map.get(target- numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}
}