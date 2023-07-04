class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int row = 0; row < accounts.length; row++){
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++){
                sum = sum + accounts[row][col]; 
            }
            if (sum > wealth){
                wealth = sum;
            }
        }
        return wealth;
    }
}

// Different method

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i-> Arrays.stream(i).sum()).max().getAsInt();
    }
}