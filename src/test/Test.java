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
		
		
//		스캐너();
		
//		스택1();
//		split();
		
//		스택프린트();
		
//		버퍼입력();
		
//		checkTime();
		
//		리스트_테스트01();
		
//		중복제거_리스트();
		
//		스트링토큰();
		
		큐();
//		큐2();
		
//		스트링빌더();
	}
	
	private static void 중복제거_리스트() {
		
		// List 준비
		List<String> list = Arrays.asList("A", "B", "C", "A");
		
		// List를 Set으로 변경
		Set<String> set = new HashSet<String>(list);
		
		// Set을 List로 변경
		List<String> newList =new ArrayList<String>(set);
		
		// 결과 출력
		System.out.println(newList);
		
		
		
	}

	static void 스캐너() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
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
		
		qq.add(1);	// 뒤에 추가
		qq.add(2);
		qq.add(3);
		qq.add(4);
		qq.offer(5);
		qq.offer(6);
		qq.offer(7); // 뒤에 추가

		System.out.println(qq);
		
//		int remove = qq.remove(); // 앞에 꺼내기
//		int poll = qq.poll(); // 앞에 꺼내기
		
		System.out.println(qq);
		
		int element = qq.element();
		int peek = qq.peek();
		
		System.out.println(element); // 최상위값
		System.out.println(peek); // 최상위값
		
		
	}

	static void 스트링토큰() {
//		String
		
		
	}
	
	static void 리스트_테스트01() {
		List<Integer> ll = new ArrayList<Integer>();
		
//		ll.add(0, 5);
		ll.add(1);
		ll.add(1);
//		ll.add(2);
//		ll.add(3);
		
		
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

	static void split() {

		// P x
		// return x
		String command = "P y"; 

		String t = command.split(" ")[1];
		
		System.out.println(t);
		
//		t.charAt(0)
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
