package 다이나믹프로그래밍;

public class Q1463_1로만들기 {

	//https://www.acmicpc.net/problem/1463
	
	// 입력 : 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
	// 출력 : 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
	// 힌트 : 10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.
	
	// 3으로 나눠지면 3으로나눔
	// 2로  나눠지면 2로 나눔
	// 1을 뺀다
	
	public static void main(String[] args) {
		int test = 10;
		
		int count = 0;
		
		while(test != 1) {
			System.out.print(test + " > ");
			
			test = 연산확인(test);
			
			count++;
		}
		System.out.println(test);
		
		System.out.println("count = " + count);
		
		
		
	}

	private static int 연산확인(int test) {
		if(test % 3 == 0) {
			test = test/3;
		}else if(test % 2 == 0) {
			test = test/2;
		}else {
			test = test-1;
		}
		
		return test;
	}
	
	
	
	
	
	
	
	
	
	
	

	

	
	
}
