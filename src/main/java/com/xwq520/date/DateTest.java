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
//		System.out.println(getDaysOfLastMonth(date));
		//System.out.println(getPreMonth(new Date()));
		//System.out.println(getPreMonth(date));
		//System.out.println(new Date());
		//String bb = aa.substring(0,aa.length()-2)+"20";
		System.out.println(getNotice()); 
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

	public static int getMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH) + 1;
	}
	
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
	 * ��ȡ��һ�������һ��
	 * @return
	 */
	public static String getLastMaxMonthDate(Date date) {  
        SimpleDateFormat dft = new SimpleDateFormat("yyyyMMdd");  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.MONTH, -1);  
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));  
        return dft.format(calendar.getTime());  
    }  

	
	public static int getDaysOfLastMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        calendar.add(Calendar.MONTH, -1);
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }  
	public static int getDaysOfMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);  
    }  
	
	public static int getDayOfMonth(Date date) {  
        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(date);  
        return calendar.get(Calendar.DAY_OF_MONTH);  
    }  
	
	
	public static String getNotice() {
		String a = "638120865.27833";
		String b = "789286092.61";
		 BigDecimal bd1 = new BigDecimal("a");
		 BigDecimal bd2 = new BigDecimal("b");
		 BigDecimal c = bd1.subtract(bd2);
		 System.out.println(c);
		return null;
	}
	
	
	
	
	
	
	
	
}
