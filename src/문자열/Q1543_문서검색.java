package 문자열;

import java.io.*;

public class Q1543_문서검색 {

	//https://www.acmicpc.net/problem/1543
	
	//그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.
	//

/*
ababababa
aba

>> 2

 */
	
	
	// substring 이용 방법 https://codingtalk.tistory.com/175
	// startWith
	
	// index of :: https://maivve.tistory.com/50
	
	// repalce :: https://airzinc.tistory.com/entry/%EB%B0%B1%EC%A4%80-1543JAVA
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String find = br.readLine();
		
		//문서의 길이는 최대 2500이다.
		//2500~
		
		//찾기
		//해당 인덱스 중복인지
		boolean[] B = new boolean[2500];
		int count = 0;
		
		for(int i=0; i < S.length() - find.length(); i++) {
//			System.out.println("==============================");
			int k = i;
			
			for(int p=0; p < find.length(); p++) {
				char v1 = S.charAt(k);
				char v2 = find.charAt(p);
				
				if(v1 == v2) {
					// 중복인지
					if(B[k]) {
//						System.out.println(k + " / 중복");
						break;
					}
					
//					System.out.println(v1 + "=" + v2 + " // 같음");
					
					// 찾은 문자 전체 맞을 경우 체크
//					System.out.println("마지막문자:" + v2 + "/" + p);
					if(p == find.length()-1) {
						for(int q=i; q <= i+p; q++) {
//							System.out.println(q);
							B[q] = true;
						}
						
						// 완료
						count++;
					}
					
					k++;
					continue;
				}else {
//					System.out.println(v1 + "=" + v2 + " // 다름");
					break;
				}
			}
		}
		
		System.out.println(count);
		
	}
	
	
	
	
	
	
	
	
}
