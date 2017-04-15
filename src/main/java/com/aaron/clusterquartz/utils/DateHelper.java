package com.aaron.clusterquartz.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateHelper {

    public static String CalendarToStrByMark(Calendar calendar, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = calendar.getTime();
        return simpleDateFormat.format(date);
    }
}
