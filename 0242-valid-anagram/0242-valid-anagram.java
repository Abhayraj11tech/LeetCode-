class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag  = true;
        if(s.length()!=t.length()){
            return false;
        }
        else{
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
             String str = new String(tempArray);

            char tempArray2[] = t.toCharArray();
            Arrays.sort(tempArray2);
            String tmp =  new String(tempArray2);

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=tmp.charAt(i)){
                    flag = false;
                    break;
                }
            }
            return flag;


        }
    }
}