package 다이나믹프로그래밍;

public class FiboTest {

	public static void main(String[] args) {
	
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));
		System.out.println(fibo(4));
		
		
	}
	
	static int fibo(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	
}
