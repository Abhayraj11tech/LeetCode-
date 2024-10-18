class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     boolean flag = false;
     StringBuilder sb = new StringBuilder(magazine);
     int count  = 0;
     for(int i=0;i<ransomNote.length();i++){
        for(int j=0;j<sb.length();j++){
            if(ransomNote.charAt(i)==sb.charAt(j)){

                ++count;
                sb.setCharAt(j,'0');
                break;
            }
        }
     }
     if(count==ransomNote.length()){
        return true;
     }
     else{
        return false;
     }
    }
}