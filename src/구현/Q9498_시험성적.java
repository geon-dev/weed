package 구현;

import java.io.*;
import java.util.*;

public class Q9498_시험성적 {

	public static void main(String[] args) {
		//https://www.acmicpc.net/problem/9498
		
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B,
		//70 ~ 79점은 C, 60 ~ 69점은 D, 
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		if(value >= 90) {
			System.out.println("A");
		}else if(value >= 80) {
			System.out.println("B");
		}else if(value >= 70) {
			System.out.println("C");
		}else if(value >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
