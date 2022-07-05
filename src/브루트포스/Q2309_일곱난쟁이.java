package 브루트포스;

import java.util.*;
import java.io.*;

public class Q2309_일곱난쟁이 {

	/*
입력값

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
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 값
		// 정렬
		// 합은 100
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i=0; i < 9; i++) {
			int value = Integer.parseInt(br.readLine());
			list.add(value);
			sum += value;
		}
		
		list.sort(null);
		
		// 더해서 100
		// 9명 >> 7명
		// 9개 합에서 2개를 빼서 100
		
		for(int i=0; i < list.size()-1; i++) {
			
			for(int j=i+1; j < list.size(); j++) {
				
				int value = sum - list.get(i) - list.get(j);
				if(value == 100) {
					for(int v : list) {
						if(v != list.get(i) && v != list.get(j)) {
							System.out.println(v);
						}
					}
					
					return;
				}
			}
		}
		
	}
	
	
	
	
}
