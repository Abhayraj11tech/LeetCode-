class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr);
        int median = boxedArr[(boxedArr.length - 1) / 2];
        Arrays.sort(boxedArr, (a, b) -> {
            int diff1 = Math.abs(a - median);
            int diff2 = Math.abs(b - median);
            if (diff1 == diff2) {
                return b - a;
            }
            return diff2 - diff1;
        });
        return Arrays.stream(boxedArr).limit(k).mapToInt(Integer::intValue).toArray();
    }
}