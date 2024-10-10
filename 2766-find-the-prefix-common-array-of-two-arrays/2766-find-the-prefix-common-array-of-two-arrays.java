class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] sol = new int[A.length];
        for(int i=0;i<A.length;i++){
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int a=0;a<=i;a++){
                arr.add(A[a]);
            }
            for(int b=0;b<=i;b++){
                if(arr.contains(B[b])){
                    ++count;
                }
            }
            sol[i] = count;
        }
        return sol;
    }
}