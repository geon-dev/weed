package begginer;

import java.io.*;

public class Q1371 {

	//https://www.acmicpc.net/problem/1371
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 배열 ++
		String S = null;
		int[] arr = new int[26+1];
		while((S = br.readLine()) != null) {
			char[] cc = S.toCharArray();
			for(int i=0; i < cc.length; i++) {
				if(cc[i] != ' ') {
					arr[(int)cc[i]-96]++;
				}
			}
		}
		
		int max = 0;
		String result = "";
		for(int i=1; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		
		for(int i=1; i < arr.length; i++) {
			if(max == arr[i]) {
				result += (char)(i+96);
			}
		}
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
}
