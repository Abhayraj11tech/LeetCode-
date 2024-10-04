class Solution {
    public String kthDistinct(String[] arr, int k) {
         String sol = "";
        int count = 0;
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[j].equals(arr[i])){
                    flag = false;
                    break;
                }
            }
         
            if(flag==true){
                ++count;
                
            }
            if(count==k){
                sol = arr[i];
                break;
            }
        }
        
        return sol;
    }
}