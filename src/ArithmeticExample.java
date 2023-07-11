
public class ArithmeticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과시간  pc시간기준
		// GMT, UTC
		
		int year = 0;
		int month = 0;
		int day = 0;
		int week = 0;
		
		long current = System.currentTimeMillis()/1000;
		long hour = current/60/60%24;      // current/60/60%24  , +9해야 한국시간
		long minute = current/60%60;    // current/60%60
		long second = current%60;
		
		System.out.println(current); 
		System.out.printf("%02d:%02d:%02d\n", hour,minute,second);
		System.out.printf("%04d/%02d/%02d/%02d\n", year,month,day,week);
	}

}

// current를 가지고 year, month, day를 구하는 것을 연구해보자
