package begginer;

import java.util.*;

public class Q2753 {
	//https://www.acmicpc.net/problem/2753
	
	/*
	 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
하지만, 2000년은 400의 배수이기 때문에 윤년이다.
	 */
	
	public static void main(String[] args) {
		int v1 = new Scanner(System.in).nextInt();
		
		if((v1%4==0 && v1%100!=0) || v1%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}
	
	

}
