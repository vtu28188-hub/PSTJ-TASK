import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day)
                .getDayOfWeek()
                .toString()
                .charAt(0) +
                LocalDate.of(year, month, day)
                .getDayOfWeek().toString().substring(1).toLowerCase();
    }
}


Input
day =
31
month =
8
year =
2019
Output
"Saturday"
Expected
"Saturday"



Input
day =
18
month =
7
year =
1999
Output
"Sunday"
Expected
"Sunday"
