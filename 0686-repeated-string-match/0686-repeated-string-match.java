class Solution {
    public int repeatedStringMatch(String a, String b) {
        String part = a;
        int count = 1;
        while(a.length()<b.length()){
            ++count;
            a += part;
        }
        if(a.contains(b)){
            return count;
        }
            ++count;
            a += part;
        
         if(a.contains(b)){
            return count;
        }
        return -1;
    }
}