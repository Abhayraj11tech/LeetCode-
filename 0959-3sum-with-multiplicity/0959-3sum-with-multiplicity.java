class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int mod = 1_000_000_007;
        long result = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    if (arr[left] == arr[right]) {
                        int count = right - left + 1;
                        result += (long) count * (count - 1) / 2;
                        result %= mod;
                        break;
                    } else {
                        int leftCount = 1;
                        int rightCount = 1;

                        while (left + 1 < right && arr[left] == arr[left + 1]) {
                            leftCount++;
                            left++;
                        }
                        while (right - 1 > left && arr[right] == arr[right - 1]) {
                            rightCount++;
                            right--;
                        }

                        result += (long) leftCount * rightCount;
                        result %= mod;

                        left++;
                        right--;
                    }
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return (int) result;
    }
}
