package com.xwq520.date;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateTest {
	public static void main(String[] args) throws Exception {
		String aa = "20171211";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(aa);
	}

	public static void test() throws Exception {
		String aa = "20170302";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = sdf.parse(aa);
		int month = getMonth(date);
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("hh");
		}
		System.out.println(month);
	}
	/**
	 * TODO 获取当前日期的月份
	 * @author liguo
	 * @param date
	 * @return 
	 * @date 2018年1月22日下午3:52:05
	 */
	public static int getMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH) + 1;
	}
	/**
	 * TODO 获取上月月份
	 * @author liguo
	 * @param date
	 * @return 
	 * @date 2018年1月22日下午3:52:49
	 */
	public static int getPreMonth(Date date) {
		 Calendar c = Calendar.getInstance();
		 c.setTime(date);
		 c.add(Calendar.MONTH, -1);
		 Date m = c.getTime();
		 System.out.println("���ڣ�"+ m);
		 int mon = getMonth(m);
		 return mon;
	}
	/**
	 * TODO 获取上一个月最后一天，返回yyyyMMdd类型字符串
	 * @author liguo
	 * @param date
	 * @return 
	 * @date 2018年1月22日下午3:49:12
	 */
	public static String getLastMaxMonthDate(Date date) {  
        SimpleDateFormat dft = new SimpleDateFormat("yyyyMMdd");  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.MONTH, -1);  
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));  
        return dft.format(calendar.getTime());  
    }  
	/**
	 * TODO 获取上个月的天数
	 * @author liguo
	 * @param date
	 * @return 
	 * @date 2018年1月22日下午3:50:41
	 */
	public static int getDaysOfLastMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.MONTH, -1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }  
	/**
	 * TODO 获取当月天数
	 * @author liguo
	 * @param date
	 * @return 
	 * @date 2018年1月22日下午3:51:00
	 */
	public static int getDaysOfMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }  
	
	/**
	 * TODO 获取当前日期的日
	 * @author liguo
	 * @param date
	 * @return 
	 * @date 2018年1月22日下午3:51:41
	 */
	public static int getDayOfMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        return calendar.get(Calendar.DAY_OF_MONTH);  
    }  
}
