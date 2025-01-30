class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int stone : stones){
            arr.add(stone);
        }
        while(arr.size() > 1){
            Collections.sort(arr);
            int val1 = arr.get(arr.size() - 1);
            int val2 = arr.get(arr.size() - 2);
            arr.remove(arr.size() - 1);
            arr.remove(arr.size() - 1);
            if (val1 != val2) {
                arr.add(val1 - val2);
            }
        }
        return arr.isEmpty() ? 0 : arr.get(0);
    }
}
