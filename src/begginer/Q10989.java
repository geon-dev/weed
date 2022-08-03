package begginer;

import java.util.*;
import java.io.*;

public class Q10989 {

	//https://www.acmicpc.net/problem/10989
/*
10
5
2
3
1
4
2
3
5
1
7	
 */
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int v : arr) {
			bw.append(v + "\n");
		}
		
		bw.flush();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
