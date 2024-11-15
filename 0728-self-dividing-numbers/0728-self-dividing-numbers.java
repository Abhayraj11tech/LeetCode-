class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
             ArrayList<Integer> sol = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
            int val = i;
            int num = i;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            while(val!=0){
                int rem = val%10;
                arr.add(rem);
                val= val/10;
            }
            boolean flag = true;
            if(arr.contains(0)){
                flag = false;
              

            }
            else{ 
            for(int j=0;j<arr.size();j++){
               
                 if(num % arr.get(j) != 0 ){
                    flag = false;
                   break;
                }
               
            }}
            if(flag==true){
                sol.add(num);
            }
        }
        return sol;
    }
}