package begginer;

import java.util.*;

public class Q11729 {
// TODO
	//https://www.acmicpc.net/problem/11729
/*
3


7
1 3
1 2
3 2
1 3
2 1
2 3
1 3	
 */
	public static void main(String[] args) {
		
		int N = 3;
//		System.out.println(st1);
//		System.out.println(st1.pop());
//		
//		System.out.println(st1.size());
//		System.out.println(st1.isEmpty());
//		
//		System.out.println(topValue(st1));
//		System.out.println(st1);
		

		move(N, 1, 3, 2);
		//  원판,현재,목표,서브
		
	}

	private static void move(int n, int i, int j, int k) {
		System.out.println(n + "/" + i + "/" + j + "/" + k);
		
		if(n == 1) {
			//남은게 1개
			System.out.println(i + " > " + j);
			return;
		}
		
		move(n-1, i, k, j);
		/*
		 * 2, 1, 2, 3
		 * 	1, 1, 3, 2 >> sysout 1 > 2 return
		 * end
		 *  
		 * 3/1/3/2
		 * move2
		 * 	2/1/2/3
		 * 	move1
		 * 		1/1/3/2
		 * 		sysout 1 > 3 return
		 * 	move1
		 * 		1/1/2/3
		 * 		sysout 1 > 2 return
		 * 
		 * move1
		 * 	1/1/3/2
		 *  sysout 1 > 3 return
		 * 
		 */
		System.out.println("====");
		move(1, i, j, k);
		move(n-1, k, j, i);
//		System.out.println(i + " > " + k);
		
		
		
	}
	

	
	
	
	
	
	
}
