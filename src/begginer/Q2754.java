package begginer;

public class Q2754 {

	//https://www.acmicpc.net/problem/2754
	
	public static void main(String[] args) {
		String a1 = "A+: 4.3, A0: 4.0, A-: 3.7\r\n" + 
				"B+: 3.3, B0: 3.0, B-: 2.7\r\n" + 
				"C+: 2.3, C0: 2.0, C-: 1.7\r\n" + 
				"D+: 1.3, D0: 1.0, D-: 0.7\r\n" + 
				"F: 0.0";
		
		String S = new java.util.Scanner(System.in).nextLine();
		
		int start = S.equals("F") ? 3 : 4;
		int end = start + 3;
		String result = a1.substring(a1.indexOf(S)+start, a1.indexOf(S)+end);
		
		System.out.println(result);
		
	}
	
	
}
