class Solution {
    public String[] findWords(String[] words) {
     boolean flag = true;
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL:";
        String three = "zxcvbnmZXCVBNM";
        ArrayList<String> sol = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            String ss = words[i];
               char tempArray[] = ss.toCharArray();

        Arrays.sort(tempArray);
          String s = new String(tempArray);
        //   System.out.println(s);

            for(int j=0;j<s.length();j++){
                String che = ""+s.charAt(j);
                String check = ""+s.charAt(0);
                if(one.contains(check)){
                    if(two.contains(che)){
                        flag = false;
                            break;
                    }
                    else if(three.contains(che)){
                        flag = false;
                        break;
                    }
                }
                else if(two.contains(check)){
                    if(one.contains(che)){
                        flag = false;
                            break;
                    }
                    else if(three.contains(che)){
                        flag = false;
                        break;
                    }
                }

                else if(three.contains(check)){
                    if(one.contains(che)){
                        flag = false;
                            break;
                    }
                    else if(two.contains(che)){
                        flag = false;
                        break;
                    }
                }
                
                
            }
            if(flag == true){
                    sol.add(ss);
            }
           
            flag = true;

        }
          String[] str = new String[sol.size()];
 
        for (int i = 0; i < sol.size(); i++) {
            str[i] = sol.get(i);
        }
        return str;
        // System.out.println(str);
    }
}