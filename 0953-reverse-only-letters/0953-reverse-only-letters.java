class Solution {
    public String reverseOnlyLetters(String s) {
          int count = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
             ArrayList<Character> elm = new ArrayList<Character>();
  ArrayList<Character> str = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
                if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')  ){
                    str.add(s.charAt(i));
                    ++count;

                }
                else{
                    arr.add(count);
                    elm.add(s.charAt(i));
                    ++count ;
                    
                }
        }
        String tmp = "";
        for(int z=str.size()-1;z>=0;z--){
            tmp += str.get(z);
        }
        String res = "";
        int p = 0;
        int q= 0;
        for(int k=0;k<s.length();k++){
         if(q<arr.size() && k==arr.get(q) ){
            //  System.out.println(elm.get(q));
            res += elm.get(q);
             ++q;
         }
         else {
                 if(p<tmp.length()){
                    //  System.out.println(tmp.charAt(p));
                    res += tmp.charAt(p);
                     
                         ++p;
                 }
        }}
        // System.out.println(res);
        return res;
       
    

    }
}