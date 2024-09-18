class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] sol = new int[2];
        boolean flag = false;
        int n = numbers.length;
       for(int i=0;i<n;i++){
        for(int j=(i+1);j<n;j++){
            if(numbers[i]+numbers[j]==target){
                sol[0]=i+1;
                sol[1]=j+1;
                flag=true;
                break;

            
        }
        }

        if(flag==true){
            break;
        }
       }
       return sol;


    }
}