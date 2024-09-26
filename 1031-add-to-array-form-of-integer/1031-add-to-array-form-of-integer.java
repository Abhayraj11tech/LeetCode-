class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       int i = num.length - 1, sum = 0;
        LinkedList<Integer> ans = new LinkedList<>();
        while (i >= 0 || k > 0 || sum > 0) {
            sum += (i < 0 ? 0 : num[i--]) + k % 10;
            ans.addFirst(sum % 10);
            sum /= 10;
            k /= 10;
        }
        return ans;
    }
}