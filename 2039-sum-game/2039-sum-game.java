class Solution {
    public boolean sumGame(String num) {
        int sum1 = 0,sum2 = 0;
        int count1 = 0, count2 = 0;
        for(int i=0;i<num.length()/2;i++){
            if(num.charAt(i)!='?'){
                sum1 += Integer.parseInt(num.charAt(i)+"");
            }
            else{
                ++count1;
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            if(num.charAt(i)!='?'){
                sum2 += Integer.parseInt(num.charAt(i)+"");
            }
            else{
                ++count2;
            }
        }
        if(count1==0 && count2==0){
            return !(sum1 == sum2);
        }
        else{
            int leftEmpty = count1;
            int rightEmpty = count2;
            int leftSum = sum1;
            int rightSum = sum2;
           if ((leftEmpty + rightEmpty) % 2 == 1) return true;
        if (leftEmpty < rightEmpty) {
            int diff = (rightEmpty - leftEmpty) / 2;
            rightSum += 9 * diff;
        } else {
            int diff = (leftEmpty - rightEmpty) / 2;
            leftSum += 9 * diff;
        }
        return leftSum != rightSum;
    }
           }
}
    
