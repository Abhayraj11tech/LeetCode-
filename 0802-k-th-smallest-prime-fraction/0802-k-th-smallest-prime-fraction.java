import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) ->
                Integer.compare(arr[a[0]] * arr[b[1]], arr[a[1]] * arr[b[0]]));

        for (int j = 1; j < arr.length; j++) {
            minHeap.offer(new int[]{0, j});
        }

        for (int i = 0; i < k - 1; i++) {
            int[] curr = minHeap.poll();
            int nextNumerator = curr[0] + 1;
            if (nextNumerator < curr[1]) {
                minHeap.offer(new int[]{nextNumerator, curr[1]});
            }
        }

        int[] result = minHeap.peek();
        return new int[]{arr[result[0]], arr[result[1]]};
    }
}
