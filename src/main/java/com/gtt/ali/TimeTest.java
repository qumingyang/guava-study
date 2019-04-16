package com.gtt.ali;

import java.util.Calendar;

/**
 * Created by qumingyang on 2019/4/16.
 */
public class TimeTest {

    public static void main(String[] args) {
        // 获取是本月的第几周
        Calendar calendar = Calendar.getInstance();
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println(weekOfMonth);
        // 测试一年中的第几个月
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(weekOfYear);
    }
}
