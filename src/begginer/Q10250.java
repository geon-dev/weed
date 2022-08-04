package begginer;

import java.util.*;

public class Q10250 {
	
	//https://www.acmicpc.net/problem/10250

	/*
2
6 12 10
30 50 72

402
1203
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스
		while(T-- > 0) {
			int H = sc.nextInt(); //층수
			int W = sc.nextInt(); //방수
			int N = sc.nextInt(); //손님
			
			int check = 0;
			for(int i=0; i < W; i++) { //호수 >>
				for(int p=0; p < H; p++) { // 층 위로
					if(++check == N) {
						String result = "";
						if(i+1 < 10) {
							result = (p+1) + "0" + (i+1);
						}else {
							result = (p+1) + "" + (i+1);
						}
						
						System.out.println(result);
					}
				}
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
