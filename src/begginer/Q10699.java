package begginer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q10699 {

	//https://www.acmicpc.net/problem/10699
	
	//서울의 오늘날짜
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String result = df.format(today);
		
		System.out.println(result);
	}
	
	
}
