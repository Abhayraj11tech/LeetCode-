class Solution {
    public int minimumPushes(String word) {
        int count = 0;
        if(word.length() <= 8){
            count = word.length();
        }
        else if(8 < word.length() &&  word.length() <= 16){
            int a = (word.length() - 8) * 2;
            count = 8 + a;
        }
        else if(16 < word.length() && word.length() <= 24){
            int b = (word.length() - 16) * 3;
            count = 24 + b;
        }
        else{
            int c = (word.length() - 24) * 4;
            count = 48 + c;
        }
        return count;
    }
}