class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String str = details[i];
            String add =""+ str.charAt(11) + str.charAt(12);
            int num = Integer.parseInt(add);
            if(num>60){
                ++count;
            }

        }
        return count;
    }
}