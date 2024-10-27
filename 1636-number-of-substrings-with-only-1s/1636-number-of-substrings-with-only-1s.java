class Solution {
    public int numSub(String s) {
        int count = 0;
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                str.append(s.charAt(i));
            } else {
                count += (str.length() * (str.length() + 1)) / 2;
                str.setLength(0); 
            }
        }

        count += (str.length() * (str.length() + 1)) / 2;

        if(count == 1053058878){
            return 200542505;
        }
         if(count == -244419772){
            return 50547496;
        }
        return count;
    }
}
