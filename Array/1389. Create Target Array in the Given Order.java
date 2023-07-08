class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList <Integer> list  = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
    int[] arr = list.stream().mapToInt(i ->i).toArray();
    return arr;
    }
}

// not clear 
class Solution {
    
public int[] createTargetArray(int[] nums, int[] index) {
     int[] target = new int[nums.length];
     int i = 0, k = 0;
	 while (i < index.length) {
		for (k = target.length - 1; k > index[i]; k--)
			target[k] = target[k - 1];
		target[index[i]] = nums[i];
		i++;
	}
    return target;
}
}
