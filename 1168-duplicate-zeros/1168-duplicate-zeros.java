class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int num : arr) {
            if (num == 0) {
                ++count;
            }
        }
       for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                if (i + count < n) {
                    arr[i + count] = 0; 
                }
                count--;
            }

            if (i + count < n) {
                arr[i + count] = arr[i]; 
            }
        }
    }
}
