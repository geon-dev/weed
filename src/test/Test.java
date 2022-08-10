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
		
		쁠쁠();
//		깊은();
//		스캐너();
		
//		스택1();
//		split();
		
//		스택프린트();
		
//		버퍼입력();
		
//		checkTime();
		
//		리스트_테스트01();
		
//		중복제거_리스트();
		
//		스트링토큰();
		
//		큐();
//		큐2();
		
//		PriorityQueue22();
		
//		스트링빌더();
		
//		StringContain();
//		SplitText();
		
//		큐테스트();
		
//		정렬01();
		
//		comparatorTest();
//		comparatorStringTest();
		
//		compareTo();
		
//		lkatjdslk();
		
//		랜덤수출력();
		
//		tasdkljf();
		
		
	}
	
	private static void 쁠쁠() {
		int N = 112;
		System.out.println(++N);
		
		System.out.println(N);
	}

	private static void 깊은() {

		int N = 8;
		int M = 8;
		
		char[][] CC = new char[N][M];
		char[][] cc = new char[N][M];
		
		CC[0][0] = 'A';
		cc = CC.clone();
		
		System.out.println(CC[0][0]);
		System.out.println(cc[0][0]);
		
		CC[0][0] = 'B';
		System.out.println();
		System.out.println(CC[0][0]);
		System.out.println(cc[0][0]);
		
	}

	private static void tasdkljf() {
		//1 B
		String s = "1 d";
		
		System.out.println(s.split(" ").length);
		
		System.out.println((int)' ');
		
	}

	private static void PriorityQueue22() {

		PriorityQueue<Integer> qq = new PriorityQueue<>();
		
		qq.add(11);
		qq.add(2);
		qq.add(10);
		qq.add(9);
		qq.add(14);
		qq.add(9);
		
		System.out.println(qq);
		
		
	}

	private static void 랜덤수출력() {
		//N(1 ≤ N ≤ 10,000,000)
		// 10000보다 작은수
//        System.out.println( + (int)((Math.random()*10000)%10));
//        System.out.println((int)(Math.random()*100));
        
        
        for(int i=0; i < 1000000; i++) {
        	int rr = (int)(Math.random()*10000);
        	System.out.println(rr);
        }
		
	}

	private static void lkatjdslk() {
		// 1~10 각자 전체 곱하기
		
		func(0);
		
		System.out.println("============");
		
		func(1);
		
	}

	private static void func(int i) {
		System.out.println(i);
		
		if(i < 10) {
			func(i+1);
		}
	}

	private static void compareTo() {
		String s1 = "c";
		String s2 = "b";
		
		System.out.println(s1.compareTo(s2));
		
	}

	private static void comparatorStringTest() {
		List<String> S = new ArrayList<>();
		S.add("dddddddddd");
		S.add("dddddd");
		S.add("dddddasdfasdfddddd");
		S.add("ddddd");
		
		for(String s : S) {
			System.out.println(s);
		}
		
		System.out.println("===============");
		// 문자 길이로 sorting

		/*
		Collections.sort(S, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
//				return -1;
			}
		});
		*/
		
		Collections.sort(S, (s1, s2) -> {
			return s1.length() - s2.length();
		});
		
		
		for(String s : S) {
			System.out.println(s);
		}
		
		
		
		
	}

	private static void comparatorTest() {
		int[][] arr = new int[2][2];
		
		arr[0][0] = 2;
		arr[0][1] = 1;
		arr[1][0] = 5;
		arr[1][1] = 6;
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		System.out.println("======================");
		/*
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] e1, int[] e2) {
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];
				}else {
					return e1[0] - e2[0];
				}
			}
		});

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		*/
		
		Arrays.sort(arr, (e1, e2) -> {
//			if(e1[0] == e2[0]) {
//				return e2[1] - e1[1];
//			}else {
//				return 1;
//			}
			return -1;
		});
		

		System.out.println("======================");

		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
	}

	private static void 정렬01() {
		
		
		
		
		
		
		
		
	}

	private static void 큐테스트() {
		String[] q = new String[3];
		q[0] = "im";
		q[1] = "no";
		q[2] = "it";
		
//		System.out.println(Arrays.toString(q));
		// Arrays.sort(q.toArray())

//		Arrays.sort(q);
		
//		System.out.println(Arrays.toString(q));
		
		
		String[] S = {};
		S[0] = new String("d");
		System.out.println(S);
		
	}

	private static void SplitText() {
		String query = "임수택||d|입니다";
//		String query = "-ㅇ";
		
//		String[] query_arr = query.split("[|()\\[\\]]+-*;&|\\s+");
//		String[] query_arr = query.split("[|()\\[\\]]+|-*;&|\\s+");
//		String[] query_arr = query.split("[|()\\[\\]]+-*;&");
		
		
//		System.out.println(Arrays.toString(query_arr));
		System.out.println(query.indexOf("-"));
		
		System.out.println(query.substring(1));
	}

	private static void StringContain() {
		String test = "(천관||영||토론)";
		
//		boolean a = test.contains("|");
//		System.out.println(a);
		
//		String[] split1 = test.split("\\|");
		
//		System.out.println(Arrays.toString(split1));
		
//		System.out.println(test.indexOf("|"));
		char ch = '|';
		
		int count = 0;
		String str = test;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println(count);
		
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
		
//		int remove = qq.remove(); // 먼저 입력한 값  꺼내기
		int poll = qq.poll(); // 먼저 입력한 값 꺼내기
		
		System.out.println(qq);
		
		int element = qq.element(); // 먼저 입력한 값
		int peek = qq.peek();
		
		System.out.println(element);
		System.out.println(peek);
		
		
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
