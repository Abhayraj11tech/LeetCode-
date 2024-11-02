class Solution {
    public String maximumTime(String time) {
        String sol = "";
        String s = time;
        if(time.charAt(0)=='?'){
            if(time.charAt(1)>='4' && time.charAt(1)!='?'){
                sol += '1';
            }
            else{ 
            sol += '2';
            }
        }
        else{
            sol += time.charAt(0);
        }

        if(time.charAt(1)=='?'){
            if(time.charAt(0)=='0'){
                sol += '9';
            }
            else if(time.charAt(0)=='1'){
                sol += '9';
            }
            else{
                sol += '3';
            }
        }
        else{
            sol += s.charAt(1);
        }

        sol += s.charAt(2);
        if(s.charAt(3)=='?'){
            sol += '5';
        }
        else{
            sol += s.charAt(3);
        }

        if(s.charAt(4)=='?'){
            sol += '9';
        }
        else{
            sol += s.charAt(4);
        }
        return sol;
    }
}