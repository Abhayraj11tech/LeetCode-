class Solution {
    public int dayOfYear(String date) {
               int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

 
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInMonth[2] = 29;
        }
    int sum = day;
    int p =1;
    for(int i=0;i<month;i++){
        sum += daysInMonth[i];
    }
    return sum;
    }
}