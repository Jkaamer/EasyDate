/*
 * Copyright (c) 2022, Jkaamer. All rights reserved.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.jkaamer.easydate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * <p>The class EasyDate contains methods for return date ,time or both them. <br>
 * Note that I have done this very small work for the convenience of you ,dear <br>
 * programmer or developer.</p>
 *
 * <p>Everyone should know how to program a computer ,because it <br>
 * teaches you how to think. <br>
 * - Steve Jobs</p>
 *
 *
 *
 *
 * @author MAHDI HOSEIN ZADE
 */
public final class EasyDate {

    /**
     * <p>Don't let anyone instantiate this class.</p>
     */
    private EasyDate() {}

    /**
     * <p>Return current <b>Date</b></p>
     * <ul><li>As the pattern -> E ,MMMM dd
     * <li>For ex : Thu ,December 01</ul>
     *
     * <ul><li>This method is static and does not take any
     * variable as an argument.</ul>
     *
     * @return date
     */
    public static String getDate()
    {
        return String.format("%s" ,setDateTime("E ,MMMM dd"));
    }

    /**
     * <p>Return current <b>time</b></p>
     * <ul><li>As the pattern -> hh:mm aa
     * <li>For ex : 05:45 PM</ul>
     *
     * This method is static and does not take any
     * variable as an argument.
     *
     * @return time
     */
    public static String getTime()
    {
        return String.format("%s" ,setDateTime("hh:mm aa"));
    }

    /**
     * <p>Return current <b>Date & Time</b></p>
     * <ul><li>As the pattern -> E ,MMM dd yyyy - HH:mm:ss-aa zz
     * <li>For ex : Thu ,Dec 01 2022 - 05:48:07-AM PST</ul>
     *
     * <p>This method is static and does not take any
     * variable as an argument.</p>
     *
     * @return date&time zone
     */
    public static String getDateTime()
    {
        return String.format("%s" ,setDateTime("E ,MMM dd yyyy - HH:mm:ss-aa zz"));
    }

    /**
     * <ul><li><p>Don't let anyone access to the date.</p>
     * <li><p>Don't let anyone access to the dateFormatter.</p></ul>
     *
     * @param format
     * @return DateTime
     */
    private static String setDateTime(String format) {
        Date date = new Date();

        /**
         * Date and Time formats are specified by date and time pattern
         */
        SimpleDateFormat dateFormatter = new SimpleDateFormat(format);

        return dateFormatter.format(date);
    }

}