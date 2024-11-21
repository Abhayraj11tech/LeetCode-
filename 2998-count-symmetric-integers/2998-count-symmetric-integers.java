class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            int val = i;

            ArrayList<Integer> arr = new ArrayList<Integer>();
            while(val!=0){
                int rem = val%10;
                arr.add(rem);
                val = val/10;
            }
             int sum1 = 0;
            int sum2 = 0;
            if(arr.size()%2!=0){
                continue;
            }
           
            else{
                for(int a=0;a<arr.size()/2;a++){
                        sum1 += arr.get(a);
                }
                for(int b=arr.size()/2;b<arr.size();b++){
                        sum2 += arr.get(b);
                }

            }
            if(sum1==sum2){
                ++count;
            }
        }
        return count;
    }
}