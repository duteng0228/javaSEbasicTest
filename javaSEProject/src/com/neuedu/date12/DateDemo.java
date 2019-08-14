package com.neuedu.date12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
* @ClassName: DataDemo
* @Description: 日期类
* @author student_dt
* @date 2019年8月12日 下午7:32:52
*
*/
public class DateDemo {
	public static void main(String[] args)  throws ParseException{
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String today = sdf.format(d);
		String today1 = sdf1.format(d);
		String today2 = sdf2.format(d);
		System.out.println(today);
		System.out.println(today1);
		System.out.println(today2);
		
		String d1 = "2019-08-12 19:56:34";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf3.parse(d1);
		System.out.println(date);
		
		Calendar instance =  Calendar.getInstance();
		int date2 = instance.getWeekYear();
		System.out.println(date2);
	}

}
