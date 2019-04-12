import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		String dateStr = "20150111161514";
		String[] date = getBeginAndEnd(dateStr);
		System.out.println(date[0]+"++++++++++"+date[1]);
		
//		String[] date = getFirstDayOfWeek(dateStr);
//        System.out.println(date[0]+"+++++"+date[1]);
	}
	
	 /**
     * 取得当前日期所在周的第一天
     *
     * @param date
     * @return
     */
    public static String[] getFirstDayOfWeek(String dateStr) {
    	Date dateTime = convertStringToDate(dateStr);
    	
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        calendar.setTime(dateTime);
        calendar.set(Calendar.DAY_OF_WEEK,
                      calendar.getFirstDayOfWeek()); // SUNDAY
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String begin = sdf.format(calendar.getTime());
        calendar.set(Calendar.DAY_OF_WEEK,
                calendar.getFirstDayOfWeek()+6);
        String end = sdf.format(calendar.getTime());
        String[] range = new String[2];
        range[0] = begin+"000000";
        range[1] = end+"235959";
        return range;
    }
	
	public static String[] getBeginAndEnd(String dateStr) {

		Date dateTime = convertStringToDate(dateStr);
        
        Calendar c = Calendar.getInstance();//创建一个日期实例
        c.setTime(dateTime);//实例化一个日期
        int week = c.get(Calendar.WEEK_OF_YEAR);
        int year = c.get(Calendar.YEAR);
        c.setWeekDate(year, week, 1);
 
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 2;
        c.add(Calendar.DATE, -dayOfWeek); // 得到本周的第一天
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String begin = sdf.format(c.getTime());
        c.add(Calendar.DATE, 6); // 得到本周的最后一天
        String end = sdf.format(c.getTime());
        String[] range = new String[2];
        range[0] = begin+"000000";
        range[1] = end+"235959";
        return range;
	}
	
	public static Date convertStringToDate(String string) {
		SimpleDateFormat df = null;
		Date date = null;
		df = new SimpleDateFormat("yyyyMMddHHmmss");
		try {
			date = df.parse(string);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return (date);
	}
}
