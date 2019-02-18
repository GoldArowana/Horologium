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
        System.out.printf("本周是本月的第%s周 \n", calendar.get(Calendar.WEEK_OF_MONTH)); // 日历的第一行是第一周, 第二行是第二周, 第三行是第三周.
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
    public void getActualMaximumDateTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.printf("当前时间是%s \n", calendar.getTime());
        System.out.printf("Calendar支持的最大年份是%s \n", calendar.getActualMaximum(Calendar.YEAR));
        System.out.printf("一年有%s个月 \n", calendar.getActualMaximum(Calendar.MONTH) + 1);
        System.out.printf("一年有%s个周 \n", calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.printf("本月有%s个自然周 \n", calendar.getActualMaximum(Calendar.WEEK_OF_MONTH));
        System.out.printf("本月的最后一天是%s号 \n", calendar.getActualMaximum(Calendar.DATE));
        System.out.printf("本月的最后一天是%s号 \n", calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.printf("今年一共有%s天 \n", calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
        System.out.printf("一周有%s天 \n", calendar.getActualMaximum(Calendar.DAY_OF_WEEK));
        System.out.printf("本月有%s个7天 \n", calendar.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.printf("AM PM 分别有%s个小时\n", calendar.getActualMaximum(Calendar.HOUR) + 1);
        System.out.printf("一天有%s个小时\n", calendar.getActualMaximum(Calendar.HOUR_OF_DAY) + 1);
        System.out.printf("一个小时有%s分钟\n", calendar.getActualMaximum(Calendar.MINUTE) + 1);
        System.out.printf("一分钟有%s秒\n", calendar.getActualMaximum(Calendar.SECOND) + 1);
        System.out.printf("一秒有%s毫秒\n", calendar.getActualMaximum(Calendar.MILLISECOND) + 1);
    }

    @Test
    public void getTimeTest() {
        Calendar calendar = Calendar.getInstance();
        System.out.printf("当前时间是%s \n", calendar.getTime());
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

    @Test
    public void setCurrentTimeMillisTest() {
        Calendar calendar = new Calendar.Builder().setInstant(System.currentTimeMillis()).build();
        System.out.println(calendar);
    }


    @Test
    public void setTimeTest() {
        Calendar calendar = new Calendar.Builder().set(Calendar.YEAR, 2001).build();
        System.out.println(calendar);
    }

    @Test
    public void convertFromDate() {
        Calendar calendar = new Calendar.Builder().setInstant(new Date()).build();
        System.out.println(calendar);
    }

    @Test
    public void convertToDate() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

}
