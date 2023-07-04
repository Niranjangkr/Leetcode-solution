class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> ans = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        // int extra[] = new int[candies.length]
        for (int i = 0; i < candies.length; i++){
            if (maxNum < candies[i]){
                maxNum = candies[i];
            }
            candies[i] = candies[i] + extraCandies;
        }
        for (int i = 0; i < candies.length; i++){
            if(candies[i] >= maxNum){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}

//second approach
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> ans = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        for (int candy : candies){
            maxNum = Math.max(candy, maxNum);
        }
        for (int candy: candies){
            ans.add(candy + extraCandies >= maxNum);
        }
        return ans;
    }
}

// third approach
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max).collect(Collectors.toList());
    }
}