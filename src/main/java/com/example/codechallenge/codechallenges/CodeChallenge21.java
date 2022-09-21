package com.example.codechallenge.codechallenges;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author juan.yee
 */
public class CodeChallenge21 {
    public static void main(String[] args) {
        System.out.println(findDay(8, 14, 2017));;
    }

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month-1);
        c.set(Calendar.DAY_OF_MONTH, day);
        c.set(Calendar.YEAR, year);

        int dw = c.get(Calendar.DAY_OF_WEEK);
        if (dw == 1) return "SUNDAY";
        else if (dw == 2) return "MONDAY";
        else if (dw == 3) return "TUESDAY";
        else if (dw == 4) return "WEDNESDAY";
        else if (dw == 5) return "THURSDAY";
        else if (dw == 6) return "FRIDAY";
        else return "SATURDAY";

//        DayOfWeek dw = c.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek();
//        return dw.getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }
}
