import java.time.LocalDate;

class Solution {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
}



Input
date =
"2019-01-09"
Output
9
Expected
9


date =
"2019-02-10"
Output
41
Expected
41
