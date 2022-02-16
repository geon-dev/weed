package test;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Test {

	public static void main(String[] args) {
		
//		test();
		
//		스택프린트();
		
//		버퍼입력();
		
//		checkTime();
		
//		리스트_테스트01();
		
		스트링토큰();
	}
	
	static void 스트링토큰() {
//		String
		
		
	}
	
	static void 리스트_테스트01() {
		List<Integer> ll = new ArrayList<Integer>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		System.out.println(ll);
		
		ll.remove(0);
		
		System.out.println(ll);
		
		
	}
	
	static void checkTime() {

		long start = System.currentTimeMillis();
		
		for(int i=0; i < 100; i++) {
			for(int q=0; q < 100; q++) {
				System.out.println("a");
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
		
	}
	
	private static void 버퍼입력() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void 스택프린트() {
		Stack<String> st = new Stack<String>();
		st.push("a");
		st.push("b");
		st.push("c");
		st.push("d");
		
		System.out.println(st);
		
		StringBuilder ssbb = new StringBuilder();
		for(String s : st) {
			ssbb.append(s);
		}
		
		System.out.println(ssbb);
		
//		Stream<String> strStream = st.stream();
//		strStream.forEach(a -> System.out.print(a));
		
		
	}

	static void test() {

		// P x
		// return x
		String command = "P y"; 

		String t = command.split(" ")[1];
		
		System.out.println(t);
		
//		t.charAt(0)
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
