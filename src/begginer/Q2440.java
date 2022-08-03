package begginer;

public class Q2440 {

	public static void main(String[] args) {
		int N = new java.util.Scanner(System.in).nextInt();
		
		for(int i=N; i > 0; i--) {
			
			for(int p=i; p > 0; p--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
