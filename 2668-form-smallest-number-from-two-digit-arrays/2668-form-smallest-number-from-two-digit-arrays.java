class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        boolean flag = false;
        int sol = -1;
        for(int i=0;i<nums1.length;i++){
            int idx = Arrays.binarySearch(nums2,nums1[i]);
            if(idx>=0){
                sol = nums1[i];
                flag = true;
                break;
            }
        }
        if(flag==true){
            return sol;
        }
        else{
            int n1 = nums1[0];
            int n2 = nums2[0];
            String res = "";
            if(n1>n2){
                res += Integer.toString(n2) + Integer.toString(n1);
            }
            else{
              res += Integer.toString(n1) + Integer.toString(n2);
            }
            return Integer.parseInt(res);
        }
    }
}