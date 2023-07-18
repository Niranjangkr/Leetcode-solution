class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        for (int[] log: logs){
            year[log[0]] += 1;
            year[log[1]] -= 1;
        }

        int Eyear = 1950, maxNum = year[1950];

        // using prefix sum 
        for (int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];
            if (year[i] > maxNum){
                maxNum = year[i];
                Eyear = i;
            }
        }
        return Eyear;
    }
     
}

// Approach
// 1st set the array to store values from  1950 to maxYear it can take
// update the values with respect to first and end values of logs array dont increment all the values in  between at start
// set the initial value of maxPopulationCount and EarliestYear
// once that done use prefix sum on the newly form array doing that you'll get the population for each year
// while you are in the loop of prefix sum simultaneously check if the maxPopulationCount can be updated that is any year has greater population than the set initial value and keep on updating it
// as you are updating the count also update the EarliestYear
// return the Earliestyear 