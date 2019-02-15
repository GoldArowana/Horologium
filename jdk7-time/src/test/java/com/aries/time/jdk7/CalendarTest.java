package com.aries.time.jdk7;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarTest {
    @Test
    public void dateEnumTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.ERA) == 0 ? "公元前" : "公元后");
        System.out.printf("今年是%s年 \n", calendar.get(Calendar.YEAR));
        System.out.printf("本月是今年的第%s个月 \n", calendar.get(Calendar.MONTH) + 1);
        System.out.printf("本周是今年的第%s周 \n", calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.printf("今天的日期是%s \n", calendar.get(Calendar.DATE));
        System.out.printf("今天是本月的第%s天 \n", calendar.get(Calendar.DAY_OF_MONTH));
        System.out.printf("今天是今年的第%s天 \n", calendar.get(Calendar.DAY_OF_YEAR));
        System.out.printf("今天是本周的第%s天 \n", calendar.get(Calendar.DAY_OF_WEEK));
        System.out.printf("今天所在的周是本月的第%s个7天 \n", calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 1~7日是第一个7天. 8~14是第二个7天. 15~21是第3个7天. 22~28是第4个7天.
    }

    @Test
    public void timeEnumTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.AM_PM) == Calendar.AM ? "上午" : "下午");
        System.out.printf("现在的时间是%s点 \n", calendar.get(Calendar.HOUR));
        System.out.printf("现在是今天的第%s个小时 \n", calendar.get(Calendar.HOUR_OF_DAY));
        System.out.printf("现在的时间是%s分 \n", calendar.get(Calendar.MINUTE));
        System.out.printf("现在的时间是%s秒 \n", calendar.get(Calendar.SECOND));
        System.out.printf("现在的时间是%s毫秒 \n", calendar.get(Calendar.MILLISECOND));
        System.out.printf("本地时间与格林威治时间差%s毫秒 \n", calendar.get(Calendar.ZONE_OFFSET));
    }

    @Test
    public void getDateTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

    @Test
    public void setGmtTest() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+9"));
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

    @Test
    public void setAreaTest() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Mexico_City"));
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }

    @Test
    public void dateFormatTest() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = calendar.getTime();
        System.out.println(sdf.format(date));
    }


}
