class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = (int)arr.length/4;
        Arrays.sort(arr);
        int count = 1;
        int sol = -1;
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
            if(arr[i+1]==arr[i]){
                ++count;
            }
            else{
                if(count>len){
                    sol = arr[i];
                    break;
                }
                count = 1;
            }
            }
            else{
                 if(count>len){
                    sol = arr[i];
                    break;
                }
                count = 1;

            }
        }
        return sol;
    }
}