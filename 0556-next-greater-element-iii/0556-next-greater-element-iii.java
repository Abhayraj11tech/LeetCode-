class Solution {
    public int nextGreaterElement(int n) {
        String str = Integer.toString(n);
        char[] arr = str.toCharArray();
        int index1 = -1;
        int index2 = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (Character.valueOf(arr[i]) < Character.valueOf(arr[i + 1])) {
                index1 = i;
                break;
            }
        }
        if (index1 == -1) {
            return -1;
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (Character.valueOf(arr[i]) > Character.valueOf(arr[index1])) {
                    index2 = i;
                    break;
                }
            }
            swap(arr, index1, index2);
            reverse(arr, index1 + 1, arr.length - 1);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            String str2 = sb.toString();
            long ans = Long.parseLong(str2);
            return (ans > Integer.MAX_VALUE) ? -1 : (int) ans;
        }
    }

    private void swap(char[] arr, int f, int s) {
        char temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
