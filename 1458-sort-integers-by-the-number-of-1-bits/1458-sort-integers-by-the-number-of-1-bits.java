import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    int bitCountA = Integer.bitCount(a);
                    int bitCountB = Integer.bitCount(b);
                    if (bitCountA != bitCountB) {
                        return bitCountA - bitCountB;
                    } else {
                        return a - b;
                    }
                })
                .mapToInt(i -> i)
                .toArray();
    }
}
