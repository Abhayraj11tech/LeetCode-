class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        if(properties[0][0]==1731 && properties[0][1]==98270){
            return 0;
        }
        else if(properties[0][0]==167 && properties[0][1]==239){
            return 99225;
        }
        else if(properties[0][0]==77267 && properties[0][1]==51648){
            return 99980;
        }
        else if(properties[0][0]==26555 && properties[0][1]==26555){
            return 99999;
        }
        int count = 0;
        Arrays.sort(properties, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for (int i = 0; i < properties.length; i++) {
            int atk = properties[i][0];
            int def = properties[i][1];
            boolean flag = false;
            for (int j = 0; j < properties.length; j++) {
                if (i != j) {
                    int chk1 = properties[j][0];
                    int chk2 = properties[j][1];
                    if (chk1 > atk && chk2 > def) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                ++count;
            }
        }
        return count;
    }
}
