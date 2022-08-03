package 문자열;

import java.util.*;

public class Q1340 {

	//https://www.acmicpc.net/problem/1340

	/*
평년일 때, 각 달은 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 
31일이 있다. 윤년에는 2월이 29일이다. 
윤년은 그 해가 400으로 나누어 떨어지는 해 이거나, 4로 나누어 떨어지면서, 
100으로 나누어 떨어지지 않는 해 일때이다. 지역에 따른 서머타임은 고려하지 않는다.

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input);
		String Month = st.nextToken();
		String DD = st.nextToken();
		DD = DD.replace(",", "");
		String YYYY = st.nextToken();
		String HHMM = st.nextToken();
		String HH = HHMM.split(":")[0];
		String MM = HHMM.split(":")[1];

		String[] monthArr = {"January", "February", "March", "April", "May", 
				"June", "July", "August", "September", "October", "November", "December"};
		int[] ddArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		double div = 365 * 24 * 60;
		if(윤년(Integer.parseInt(YYYY))) {
			ddArr[1] = 29;
			div = 366 * 24 * 60;
		}
//		System.out.println("div=" + div);
		
		// input의 시점
		int daySum = 0;
		for(int i=0; i < monthArr.length; i++) {
			if(Month.equals(monthArr[i])) {
				for(int p=0; p < i; p++) {
					daySum += ddArr[p];
				}
			}
		}
		
		daySum += Integer.parseInt(DD)-1;
//		System.out.println("daySum=" + daySum);
		
		int totalMin = (daySum*24*60) + (Integer.parseInt(HH)*60) + Integer.parseInt(MM);
//		System.out.println("totalMin=" + totalMin);
		
		double result = totalMin / div;
		System.out.println(result * 100);
		
		
	}
	
	public static boolean 윤년(int v) {
		if(v%400 == 0 || (v%4 == 0 && v%100 != 0)) {
			return true;
		}
		
		return false;
	}
	
	
}
