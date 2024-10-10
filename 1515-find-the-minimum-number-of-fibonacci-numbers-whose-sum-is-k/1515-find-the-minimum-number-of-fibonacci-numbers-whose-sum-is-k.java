class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n1 = 1;
        int n2 = 1;
        arr.add(n1);
        arr.add(n2);
        int sum = n1 + n2;
        
        while(sum <= k) {
            arr.add(sum);
            n1 = n2;
            n2 = sum;
            sum = n1 + n2;
        }
        
        int count = 0;
        for(int i = arr.size() - 1; i >= 0; i--) {
            int val = arr.get(i);
            if(val <= k) {
                k -= val;
                count++;
            }
            if(k == 0) {
                break;
            }
        }
        
        return count;
    }
}
