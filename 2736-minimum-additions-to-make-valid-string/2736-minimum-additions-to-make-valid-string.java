class Solution {
    public int addMinimum(String word) {
        int count=0;
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put('a','b');
        hm.put('b','c');
        hm.put('c','a');
        if(word.charAt(0)=='b')
            count+=1;
        if(word.charAt(0)=='c'){
            count+=2;
            if(word.length()==1)
                return count;
        }
        for(int i=0;i<word.length();i++){
            if(i==word.length()-1){
                if(word.charAt(i)=='a')
                    count+=2;
                if(word.charAt(i)=='b')
                    count+=1;
                break;
            }
            char ch=word.charAt(i);
            char ch2=word.charAt(i+1);
            if(ch==ch2)
                count+=2;
            else{
                if(ch2!=hm.get(ch))
                    count+=1;
            }
        }
        return count;
    }
}