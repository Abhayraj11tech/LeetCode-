class Solution {
    public int[] numberOfLines(int[] widths, String s) {
       int sum = 0;
        int count = 1;
          ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if( sum +  widths[((int)s.charAt(i) - 97)] <= 100){ 
            sum = sum +  widths[((int)s.charAt(i) - 97)] ;
            }
            else{
                ++count;
                arr.add(sum);
                sum = widths[((int)s.charAt(i) - 97)];
            }
            if(i==s.length()-1){
                arr.add(sum);
            }
          

        }
        int [] sol = new int[2];
        sol[0] = count;
        sol[1] = arr.get(arr.size()-1);
        return sol;
        // System.out.println(sol[0]);
        //   System.out.println(sol[1]);
        
        
    }
}