class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for (int row = 0; row < image.length; row++) {
           image[row] = reverse(image[row]);
           image[row] = invert(image[row]);
       }
       return image;
    }

    public int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - 1 - i;
            if (last <= i){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }

    public int[] invert(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }
        return arr;
    }
}

// method 2
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       for (int[] row : image ){
           for (int i = 0; i * 2 < row.length; i++ ){
               if (row[i] == row[ row.length - i - 1]){
                   row[i] = row[row.length - i - 1 ] ^= 1;
               }
           }
       }
       return image;
    }
}