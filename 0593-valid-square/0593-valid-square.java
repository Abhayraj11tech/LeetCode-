class Solution {
    public double distance(int[] p1, int[] p2){
        return Math.pow((p1[0]-p2[0]), 2) + Math.pow((p1[1]-p2[1]), 2);
    }


    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double a2 = distance(p1, p2);
        double a3 = distance(p1, p3);
        double a4 = distance(p1, p4);
        double a6 = distance(p2, p3);
        double a8 = distance(p2, p4);
        double a12 = distance(p3, p4);
        if(p1[0]==p2[0]&&p1[1]==p2[1]) return false;
        if(p1[0]==p3[0]&&p1[1]==p3[1]) return false;
        if(p1[0]==p4[0]&&p1[1]==p4[1]) return false;
        if(p2[0]==p3[0]&&p2[1]==p3[1]) return false;
        if(p2[0]==p4[0]&&p2[1]==p4[1]) return false;
        if(p3[0]==p4[0]&&p3[1]==p4[1]) return false;
        if(a2==a3){
            if(a4==(a2+a3)&&a8==a12) return true;
            return false;
        }
        if(a3==a4){
            if(a2==(a3+a4)&& a6==a8) return true;
            return false;
        }
        if(a2==a4){
            if(a3==(a2+a4)&&a6==a12) return true;
            return false;
        }
        return false;
    }
}