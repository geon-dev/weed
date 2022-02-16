package begginer;

import java.util.*;
import java.io.*;

/*
 * https://www.acmicpc.net/problem/15552
 * 
 * 입출력
 * 
 * 빠른 A+B
 */
public class Q15552 {
/*
 * Java를 사용하고 있다면, Scanner와 
 * System.out.println 대신 
 * BufferedReader와 BufferedWriter를 
 * 사용할 수 있다. BufferedWriter.
 * flush는 맨 마지막에 한 번만 하면 된다.
 */
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		
		
//		test01();
		test02();
		
		
		
		
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
	}
	
	public static void test01() {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i < X; i++) {
			String s = sc.nextLine();
			
			int A = Integer.parseInt(s.split(" ")[0]);
			int B = Integer.parseInt(s.split(" ")[1]);
			
			System.out.println(A+B);
		}
	}
	
	public static void test02() {
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int X = Integer.parseInt(br.readLine());
			
			for(int i=0; i < X; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				bw.write((a+b)+"\n");
			}
			
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
