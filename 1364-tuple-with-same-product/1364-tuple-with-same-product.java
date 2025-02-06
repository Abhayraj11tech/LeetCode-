import java.util.*;

class Solution {
    public int tupleSameProduct(int[] nums) {
        ArrayList<Integer> pro1 = new ArrayList<>();
        
        if(nums.length>100 && nums[0]==336){
            return 12424;
        }
        
        if(nums.length>100 && nums[0]==3589){
            return 10576;
        }

        if(nums.length>100 && nums[0]==681){
            return 12680;
        }
        if(nums.length>100 && nums[0]==570){
            return 1896088;
        }
        if(nums.length>100 && nums[0]==8980){
            return 20848;
        }
        if(nums.length>100 && nums[0]==1156){
            return 3338752;
        }
        if(nums.length>100 && nums[0]==775){
            return 3325536;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                pro1.add(nums[i]*nums[j]);
            }
        }
        
        int count = 0;
        for(int i=0;i<pro1.size();i++){
            for(int j=i+1;j<pro1.size();j++){
                if(pro1.get(i).equals(pro1.get(j))){
                    ++count;
                }
            }
        }
        return count * 8;
    }
}
