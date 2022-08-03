package begginer;

import java.util.*;

public class Q2920 {

	//https://www.acmicpc.net/problem/2920
	//첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		for(int i=0; i < 8; i++) {
			int v = sc.nextInt();
			
			arr[i] = v;
		}
		
		boolean isA = false;
		boolean check = false;
		
		if(arr[0] == 1) {
			isA = true;
			for(int i=1; i < 8; i++) {
				if(arr[i] != (i+1)) {
					check = true;
				}
			}
		}else {
			for(int i=0; i < 8; i++) {
				if(arr[i] != (8-i)) {
					check = true;
				}
			}
		}

		if(check) {
			System.out.println("mixed");
		}else {
			if(isA) {
				System.out.println("ascending");
			}else {
				System.out.println("descending");
			}
		}
		
	}
	
	

}
