package org.example;

import java.util.Calendar;
import java.util.Date;

public class TryOutSuraj {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        String replaceDate = date.toString().replace(" ", "_").replace(":", "_");
        if (!replaceDate.isEmpty()) {
            System.out.println(replaceDate);
        }
    }
}
