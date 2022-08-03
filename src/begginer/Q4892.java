package begginer;

import java.util.*;

public class Q4892 {

	//https://www.acmicpc.net/problem/4892
	
	public static void main(String[] args) {
		
/*
친구에게 n1 = 3*n0 계산을 하라고 한 뒤, n1이 짝수인지 홀수인지를 말해달라고 한다.
n1이 짝수라면, n2 = n1/2를, 홀수라면 n2 = (n1+1)/2를 계산해달라고 한다.
n3 = 3*n2의 계산을 부탁한다.
친구에게 n4 = n3/9를 계산한 뒤, 그 값을 말해달라고 한다. (n4는 나눗셈의 몫이다)
자 이제, n1이 짝수였다면, n0 = 2*n4로, 홀수였다면, n0 = 2*n4+1로 처음 친구가 생각한 숫자를 맞출 수 있다.		
 */
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		while(true) {
			int n0 = sc.nextInt();
			if(n0 == 0) return;
			
			int n1 = n0 * 3;
			
			int n2 = 0;
			if(n1%2 == 0) {
				n2 = n1 / 2;
			}else {
				n2 = (n1+1) / 2;
			}
			
			int n3 = 3 * n2;
			
			int n4 = n3 / 9;
			
			if(n1%2 == 0) {
				System.out.println(n++ + ". even " + n4);
			} else {
				System.out.println(n++ + ". odd " + n4);
			}
		}
	}
	
	
}
