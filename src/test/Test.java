package test;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Test {

	/*
	 * URL :
	 * 제목 :
	 * 
	 * 시간 :
	 * 
	 * 비고 :
	 * 
	 * 추후 :
	 * 
	 */
	
	public static void main(String[] args) {
		
		스택1();
//		test();
		
//		스택프린트();
		
//		버퍼입력();
		
//		checkTime();
		
//		리스트_테스트01();
		
//		스트링토큰();
		
//		큐();
//		큐2();
		
//		스트링빌더();
	}
	
	private static void 스택1() {
		Stack<Character> st = new Stack<Character>();
		
		st.add('a');
		st.add('b');
		
		System.out.println(st);
		
		System.out.println(st.pop());
		
		System.out.println(st.peek());
		
		System.out.println(st);
		
		
	}

	private static void 스트링빌더() {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("===============");
		
		for(int i=0; i < 10; i++) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
		
		System.out.println("===============");
		
		// 마지막 개행문자 제거
		sb.deleteCharAt(sb.lastIndexOf("\n"));
		System.out.println(sb);
		
		System.out.println("===============");
		
	}

	private static void 큐2() {
		
		
	}

	private static void 큐() {
		// 1 2 3 4 5 6 7
		Queue<Integer> qq = new LinkedList<>();
		
		qq.add(1);
		qq.add(2);
		qq.add(3);
		qq.add(4);
		qq.add(5);
		qq.add(6);
		qq.add(7); // 뒤에 추가
		
//		qq.poll(); // 앞에 꺼내기
//		qq.remove(); // 앞에 제거
		
		int value1 = qq.poll();
		int value2 = qq.poll();
		qq.remove();
		
		System.out.println(qq);
		
		qq.add(value1);
		qq.add(value2);
		
		System.out.println(qq);
		
		
	}

	static void 스트링토큰() {
//		String
		
		
	}
	
	static void 리스트_테스트01() {
		List<Integer> ll = new ArrayList<Integer>();
		
//		ll.add(0, 5);
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
		
		System.out.println(ll.get(0));
		
		System.out.println(ll);
		
		
//		ll.remove(ll.size()-1); // 맨뒤 삭제
		
//		ll.remove(0); // 0번째 삭제
		
//		ll.add(0, 9); // 앞에 넣고 밀어내기
		
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
