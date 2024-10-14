class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            String cmp = "" + nums[i];
            char tempArray[] = cmp.toCharArray();
            Arrays.sort(tempArray);
            String str = new String(tempArray);
            char c = str.charAt(str.length()-1);
            String val = "";
            for(int j=0;j<cmp.length();j++){
                val += c;
            }
            
            int num = Integer.parseInt(val);
            sum += num;

        }
        return sum;
    }
}