class Solution {
    public String maskPII(String s) {
         String res = "";
           int count = 0;
           int phone = 0;
           String contact = "";
        ArrayList<String> arr = new ArrayList<String>();
        String save = s;
          char tempArray[] = save.toCharArray();

        Arrays.sort(tempArray);

        String str = new String(tempArray);
        
if((int)str.charAt(s.length()-1)>=48 && (int)s.charAt(str.length()-1)<=57){
    for(int i=0;i<s.length();i++){
        if((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57){
                ++phone;
            
        }
    }

                
                
        if(phone==10){
          contact += "***-***-";
          int freq = 0;
          String one = ""; 
          for(int k=s.length()-1;k>=0;k--){
              if(freq==4){
                  break;
              }
               if((int)s.charAt(k)>=48 && (int)s.charAt(k)<=57){
              one += s.charAt(k);
              ++freq;
               }
               
          }
          StringBuilder input1 = new StringBuilder();
 
        input1.append(one);
 
        input1.reverse();
        contact += input1;
          
        }
                 
                
        else if(phone==11){
          contact += "+*-***-***-";
          int freq2 = 0;
          String two = ""; 
          for(int k=s.length()-1;k>=0;k--){
              if(freq2==4){
                  break;
              }
               if((int)s.charAt(k)>=48 && (int)s.charAt(k)<=57){
              two += s.charAt(k);
              ++freq2;
               }
               
          }
          StringBuilder input2 = new StringBuilder();
 
        input2.append(two);
 
        input2.reverse();
        contact += input2;
          
        }
         else if(phone==12){
          contact += "+**-***-***-";
          int freq3 = 0;
          String three = ""; 
          for(int k=s.length()-1;k>=0;k--){
              if(freq3==4){
                  break;
              }
               if((int)s.charAt(k)>=48 && (int)s.charAt(k)<=57){
              three += s.charAt(k);
              ++freq3;
               }
               
          }
          StringBuilder input3 = new StringBuilder();
 
        input3.append(three);
 
        input3.reverse();
        contact += input3;
          
        }
        
        else if(phone==13){
          contact += "+***-***-***-";
          int freq4 = 0;
          String four= ""; 
          for(int k=s.length()-1;k>=0;k--){
              if(freq4==4){
                  break;
              }
               if((int)s.charAt(k)>=48 && (int)s.charAt(k)<=57){
              four += s.charAt(k);
              ++freq4;
               }
               
          }
          StringBuilder input4 = new StringBuilder();
 
        input4.append(four);
 
        input4.reverse();
        contact += input4;
          
        }
        return contact;
        
        }
        
else{
           
            for(int i=0;i<s.length();i++){
                if(i==0){
                    res += s.charAt(i);
                }
                if(count==0){
               
                for(int c=0;c<5;c++){
                    res += '*';
                
                }
                count = 1;
                }
            if((i+1)<s.length() && s.charAt(i+1)==('@')){
                
                    res += s.charAt(i);
                    for(int j=i+1;j<s.length();j++){
                        res += s.charAt(j);
                                            }
                }
               
            }
            return  res.toLowerCase();
          
        }
    
  
        
        
    

    }
}