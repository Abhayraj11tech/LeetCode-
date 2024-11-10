class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c1 = (int)coordinate1.charAt(0) - 97 + 1;
        int c2 = (int)coordinate2.charAt(0);

        int n1 = (int)coordinate1.charAt(1);
        int n2 = (int)coordinate2.charAt(1);

        boolean white1 = false,white2 = false, black1 = false,black2 = false;
        if(n1%2==0 && c1%2!=0){
            white1 = true;
        }
        else if(n1%2==0 && c1%2==0){
            black1 = true;
        }
        else if(n1%2!=0 && c1%2!=0){
            black1 = true;

        }
        else if(n1%2!=0 && c1%2==0){
            white1 = true;
        }


          if(n2%2==0 && c2%2!=0){
            white2 = true;
        }
        else if(n2%2==0 && c2%2==0){
            black2 = true;
        }
        else if(n2%2!=0 && c2%2!=0){
            black2 = true;

        }
        else if(n2%2!=0 && c2%2==0){
            white2 = true;
        }
        if(white1 == white2 || black1==black2){
            return true;
        }
        else{
            return false;
        }


    }
}