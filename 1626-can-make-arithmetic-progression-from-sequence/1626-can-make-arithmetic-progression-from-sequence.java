class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int chk = arr[1] - arr[0];
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(i+1<arr.length){
                if((arr[i+1]-arr[i])!= chk ){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
        
    }
}