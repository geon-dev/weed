package begginer;

import java.util.*;
import java.math.*;

public class Q15829 {

	//https://www.acmicpc.net/problem/15829
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 해당수 * 31자릿수승 / 1234567891
		
		//
		
		int L = sc.nextInt();
		sc.nextLine();
		
		String S = sc.nextLine();
		BigInteger sum = new BigInteger("0");
		
		// TODO : long 이용해 풀기
		// https://comain.tistory.com/280
		
		for(int i=0; i < L; i++) {
			int v = (int)S.toCharArray()[i] - 96;
			
			long x = 1;
			for(int p=0; p < i; p++) {
				x *= 31;
			}
			
//			sum += v * x;
			sum = sum.add(BigInteger.valueOf(v*x));
		}
		
		System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
