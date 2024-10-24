class Solution {
    public String reformatDate(String date) {
        String day = "";
        String month = "";
        String year = "";
        
        int count = 1;
        
        for (int i = 0; i < date.length(); i++) {
            if (count == 2 && date.charAt(i) == ' ') {
                year = date.substring(i + 1);
                break;
            } else if (count == 1 && date.charAt(i) == ' ') {
                month = date.substring(i + 1, date.indexOf(' ', i + 1));
                day = date.substring(0, i);
                count++;
            }
        }
        
        int monthNum = getMonthNumber(month);
        String dayFormatted = String.format("%02d", Integer.parseInt(day.replaceAll("\\D", "")));
        String monthFormatted = String.format("%02d", monthNum);
        
        return String.format("%s-%s-%s", year, monthFormatted, dayFormatted);
    }
    
    private int getMonthNumber(String month) {
        switch (month) {
            case "Jan": return 1;
            case "Feb": return 2;
            case "Mar": return 3;
            case "Apr": return 4;
            case "May": return 5;
            case "Jun": return 6;
            case "Jul": return 7;
            case "Aug": return 8;
            case "Sep": return 9;
            case "Oct": return 10;
            case "Nov": return 11;
            case "Dec": return 12;
            default: return 0;
        }
    }
}
