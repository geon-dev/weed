package begginer;

import java.util.*;
import java.io.*;

public class Q2309_브루트포스 {

	/*
	 * URL : https://www.acmicpc.net/problem/2309
	 * 제목 : 일곱 난쟁이
	 * 
	 * 시간 : 15:47 > 16:30
	 * 
	 * 비고 :
	 * 
	 * 추후 : 브루트포스 방법으로 다시 풀어보기
	 * 
	 */
	
	
	public static void main(String[] args) throws Exception{
		List<Integer> ll = new ArrayList<Integer>();
		
//		ll.add(20);
//		ll.add(7);
//		ll.add(23);
//		ll.add(19);
//		ll.add(10);
//		ll.add(15);
//		ll.add(25);
//		ll.add(8);
//		ll.add(13);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int q = 0; q < 9; q++) {
			ll.add(Integer.parseInt(br.readLine()));
		}
		
		ll.sort(null);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < ll.size(); i++) {
			List<Integer> compareList = new ArrayList<Integer>();
			
			compareList.addAll(ll);
			compareList.remove((Integer)ll.get(i));
			for(int o = 0; o < compareList.size(); o++) {
				List<Integer> compareList2 = new ArrayList<Integer>();
				
				compareList2.addAll(compareList);
				compareList2.remove((Integer)compareList.get(o));
				for(int p = 0; p < compareList2.size(); p++) {
					
					if(sumList(compareList2) == 100) {
//						System.out.println(compareList2);
						
						for(int value : compareList2) {
							System.out.println(value);
						}
						
						return;
					}
					
				}
			}
		}
	}
	
	private static int sumList(List<Integer> ll) {
		int sum = 0;
		for(int value : ll) {
			sum += value;
		}
		return sum;
	}
	

	public static void main2(String[] args) {
		
		
		// 입력
		/*
		20
		7
		23
		19
		10
		15
		25
		8
		13
		 */
		// 오름차순
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(20);
		arrInt.add(7);
		arrInt.add(23);
		arrInt.add(19);
		arrInt.add(10);
		arrInt.add(15);
		arrInt.add(25);
		arrInt.add(8);
		arrInt.add(13);
		
		arrInt.sort(null);
		System.out.println(arrInt);
		
		// 7개의 합 100
		// remove 0~9 : 3개를 해서
		
		int sum = 0;
		
		for(int i=0; i < 9; i++) {
			sum += arrInt.get(i);
		}
		
		System.out.println("sum=" + sum);
		
		for(int i=0; i < 9; i++) {
			for(int o=0; o < 9; o++) {
				if(o == i) continue;
				
				for(int p=0; p < 9; p++) {
					if(p == i) continue;
					if(p == o) continue;
					
					int calSum = sum;
					
					calSum = calSum - arrInt.get(i) - arrInt.get(o) - arrInt.get(p);
					
//					System.out.println(calSum);
					
					if(calSum == 100) {
						
						System.out.println(i + " / " + o + " / " + p);
						
					}
				}
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
