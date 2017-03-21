package com.aaron.clusterquartz.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by madison on 2017/3/21.
 */
public class DateFormatUtils {

    public static String format(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
}
