class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            int j = i+1;
            int temp = arr[j];
            while (j < arr.length) {
                if (temp < arr[j]) {
                    temp = arr[j];
                }
                j++;
            }
            arr[i] = temp;
        }
        arr[arr.length-1] = -1;
    return arr;

    }
}