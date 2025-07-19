class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int[] arr = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            arr[idx++] = num;
        }

        Arrays.sort(arr);

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > count) {
                break;
            }
            count++;
        }

        return count;
    }
}
