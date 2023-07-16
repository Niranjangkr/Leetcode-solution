import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (k > 0 || i >= 0) {
            if (i >= 0) {
                k += num[i];
            }
            list.add(k % 10);
            k /= 10;
            i--;
        }
        // Reverse the list to get the correct order
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        return list;
    }
}


// method 2
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        for(int i = num.length - 1; i >= 0; i-- ){
            list.add(0, (k + num[i]) % 10);
            k = (k + num[i]) / 10;
        }
        while(k > 0 ){
            list.add(0, (k % 10));
            k = k/10;
        }
        return list;
    }
}