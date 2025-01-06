class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        while (result.size() < n) {
            List<Integer> temp = new ArrayList<>();
            for (int x : result) {
                if (x * 2 - 1 <= n) {
                    temp.add(x * 2 - 1); 
                }
            }
            for (int x : result) {
                if (x * 2 <= n){
                    temp.add(x * 2);
                } 
            }
            result = temp;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}