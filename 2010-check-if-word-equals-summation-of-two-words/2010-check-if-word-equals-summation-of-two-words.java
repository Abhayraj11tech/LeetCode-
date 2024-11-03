class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
                String val1 = "";
        for(int i=0;i<firstWord.length();i++){
            int n1 = (int)firstWord.charAt(i) - 97;
            val1 += Integer.toString(n1);
        }
        String val2 = "";
        for(int i=0;i<secondWord.length();i++){
            int n2 = (int)secondWord.charAt(i) - 97;
            val2 += Integer.toString(n2);
        }
        
         String val3 = "";
        for(int i=0;i<targetWord.length();i++){
            int n3 = (int)targetWord.charAt(i) - 97;
            val3 += Integer.toString(n3);
        }

        int num = Integer.parseInt(val1) + Integer.parseInt(val2);
        return num == Integer.parseInt(val3);
}
}