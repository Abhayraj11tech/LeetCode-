class Solution {
    public String getHint(String secret, String guess) {
       char tempArray[] = secret.toCharArray();
        Arrays.sort(tempArray);
        String s = new String(tempArray);
          char tempArray2[] = guess.toCharArray();
        Arrays.sort(tempArray2);
        String g = new String(tempArray2);
  
StringBuilder sb = new StringBuilder(g);

        int count = 0;
        for(int j=0;j<s.length();j++){
        for(int i=0;i<sb.length();i++){
            if(s.charAt(j)==sb.charAt(i)){
                sb.deleteCharAt(i);
                ++count;
                break;
            }

            
        }
        }
       
        
        int val = 0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                ++val;
            }
        }

    String sol = Integer.toString(val) + "A" +Integer.toString(count-val)  + "B";
        // System.out.println(sol);
        return sol;
        


        
    }
}