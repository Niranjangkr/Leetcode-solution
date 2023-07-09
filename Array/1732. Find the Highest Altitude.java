class Solution {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int count = 0;
        for (int num: gain){
            count += num;
            if (count > maxAlt) maxAlt = count;
        }
        return maxAlt;
    }
}