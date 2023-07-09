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