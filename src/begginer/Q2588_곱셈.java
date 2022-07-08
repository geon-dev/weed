package begginer;
import java.util.*;

public class Q2588_곱셈 {

	// https://www.acmicpc.net/problem/2588
	
	public static void main(String[] arsg) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int v1 = Integer.parseInt(s1);
		
		int sum = 0;
		for(int i=s2.length()-1; i >= 0; i--) {
			int vv = Integer.parseInt(s2.charAt(i)+"");
			
			int result = v1 * vv;
			
			System.out.println(result);
			
			if(i == 1) {
				result = result * 10; 
			}else if(i == 0) {
				result = result * 100; 
			}
			
			sum += result;
		}
		
		System.out.println(sum);
	}
	
	
	
	
	
	
	
	
	
	
}
