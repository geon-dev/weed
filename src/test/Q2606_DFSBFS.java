package test;

import java.util.*;
import java.io.*;


public class Q2606_DFSBFS {

	/*
	 * URL : https://www.acmicpc.net/problem/2606
	 * 제목 : 바이러스
	 * 
	 * 시간 : 10:25
	 * 
	 * 비고 :
	 * 
	 * 추후 :
	 * 
	 */

	/*
		7 // 컴퓨터수
		6 // 직접연결된 컴퓨터쌍
		1 2
		2 3
		1 5
		5 2
		5 6
		4 7
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[count][2];
		
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		System.out.println(Arrays.toString(arr[0]));
		
		
		
	}
	
	public static void main2(String[] args) {
		
		List<Integer> result = new ArrayList<Integer>();
		
		//입력
		// 1,2 2,3 ... 

		int[] arr1 = {1, 2};
		int[] arr2 = {2, 3};
		
		// 기존꺼에 관련값이 있냐
		boolean relate = false;
		
		relate = 연관됐냐(arr1, arr2);
		
		if(relate) {
			System.out.println("연관됨");
			
			for(int a : arr1) {
				result.add(a);
			}
			
			for(int b : arr2) {
				result.add(b);
			}
		}
		
		// 연관되면 다음것 확인
		
		// 아니면 끊김
		
		System.out.println(result);
		
	}
	
	static boolean 연관됐냐(int[] arr1, int[] arr2) {
		for(int value : arr1) {
			for(int compare : arr2) {
				if(value == compare) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
