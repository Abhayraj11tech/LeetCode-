class Solution {
    public String reverseVowels(String s) {
      StringBuilder arr = new StringBuilder(s);
  
     ArrayList<Character> v = new ArrayList<Character>();
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)=='a' || arr.charAt(i)=='e' || arr.charAt(i)=='i' || arr.charAt(i)=='o' || arr.charAt(i)=='u' || arr.charAt(i)=='A' || arr.charAt(i)=='E' || arr.charAt(i)=='I' ||arr.charAt(i)=='O' ||arr.charAt(i)=='U'){ 
            v.add(arr.charAt(i));
            }
        }
        Collections.reverse(v);
        StringBuilder sb = new StringBuilder(s);
        int p = 0;


         for(int i=0;i<s.length();i++){
              if(arr.charAt(i)=='a' || arr.charAt(i)=='e' || arr.charAt(i)=='i' || arr.charAt(i)=='o' || arr.charAt(i)=='u' || arr.charAt(i)=='A' || arr.charAt(i)=='E' || arr.charAt(i)=='I' ||arr.charAt(i)=='O' ||arr.charAt(i)=='U'){ 
            sb.setCharAt(i,v.get(p++));
            }
        }
        String str = sb.toString();

        return str;
        // System.out.println(str);


        
    }
}