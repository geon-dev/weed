package begginer;

public class Q2744 {

	//https://www.acmicpc.net/problem/2744
	
	public static void main(String[] args) {
		String S = new java.util.Scanner(System.in).nextLine();
		char[] c = S.toCharArray();
		
		for(int i=0; i < c.length; i++) {
			int k = (int)c[i];
			
			if(k >= 65 && k <= 90) {
				c[i] = (char)(k + 32);
			}else {
				c[i] = (char)(k - 32);
			}
		}
		
		System.out.println(c);
	}
	
	
	
}
