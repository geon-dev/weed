package 브루트포스;

import java.util.*;
import java.io.*;

public class 입출력01 {

	public static void main(String[] args) throws Exception{
		
		입력();
		
		// 명령 갯수 : M
		// add 1
		// remove 2
		// check
		
		
		
		// list
		
//		asdf();
		
		
//		출력();
		
	}

	private static void asdf() {
		// TODO Auto-generated method stub
		List<HashMap<Integer, String>> ll = new ArrayList<>();
		for(int i=0; i < ll.size(); i++) {
			if(i==0) {
				continue;
			}
			
			HashMap<Integer, String> mm = new HashMap<Integer, String>();
			mm = ll.get(i);
			
			String v1 = mm.get(1);
			String v2 = mm.get(2);
			
			프로세스(v1, v2);			
		}
		
	}

	private static void 입력() throws Exception{
		int M = 1; // 입력의 갯수
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(b1);
		// string token
		

		List<HashMap<Integer, String>> ll = new ArrayList<>();
		
		
		for(int i=0; i < M; i++) {
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			
			String b1= br.readLine();
			StringTokenizer st = new StringTokenizer(b1, " ");
			System.out.println(st.countTokens());

			
			
			
		}
		
		
//		System.out.println(st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextElement());
		
		
//		hm.put(1, "add");
//		hm.put(2, "1");
		
//		ll.add(hm);
		
//		System.out.println("input");
//		System.out.println(ll);
		
		
	}

	private static void 프로세스(String v1, String v2) {
		System.out.println("output");
		System.out.println(v1 + "/" + v2);
		
	}
	
	
	
	
	
}
