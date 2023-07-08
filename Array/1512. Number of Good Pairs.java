class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}

// method 2
class Solution {
    public int numIdenticalPairs(int[] guestList) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int friend:guestList)
        {
            int friendCount = hm.getOrDefault(friend,0);
            ans+=friendCount;
            hm.put(friend,friendCount+1);
        }
        
        
        return ans;
    }
}

// method 3
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0, count[] = new int[101];
        for (int num: nums){
            ans += count[num]++;
        }
        return ans;
    }
}