class Solution {
    public boolean isFascinating(int n) {
         String s1 = Integer.toString(n);
        int val1 = 2*n;
        String s2 = Integer.toString(val1);
        int val2 = 3*n;
        String s3 = Integer.toString(val2);
        String val = s1+s2+s3;
        long num = Long.parseLong(val);
         System.out.println(num);

        ArrayList<Long> cmp = new ArrayList<Long>();
        while(num!=0){
            long rem = num%10;
            cmp.add(rem);
            num = num/10;
        }
        Collections.sort(cmp);
        boolean flag = true;
        int p =1;
        for(int i=0;i<cmp.size();i++){
            if(cmp.get(i)!=p++){
                flag = false;
                break;
            }
         
        }
        return flag;
        // System.out.println(flag);



    }
}