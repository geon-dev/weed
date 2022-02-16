package begginer;

/*
 * https://www.acmicpc.net/problem/10828
 * 
 * 자료구조 - 스택
 * 
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 */
public class Q10828	 {
	
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) {
		
		System.out.println(java.util.Arrays.toString(args));
	}
	
	public static void main2(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = in.nextInt();
		stack = new int[N];
		
		for(int i=0; i<N; i++) {
			String str = in.next();

			switch(str) {
			case "push":
				push(in.nextInt());
				break;
			case "pop":
				sb.append(pop()).append('\n');
				break;
			case "size":
				sb.append(size()).append('\n');
				break;
			case "empty":
				sb.append(empty()).append('\n');
				break;
			case "top":
				sb.append(top()).append('\n');
				break;
			}
			
		}
		
		System.out.println(sb);
		
	}
	
	//push
	public static void push(int item) {
		stack[size] = item;
		size++;
	}
	
	//pop
	public static int pop() {
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 
//만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	
		if(size == 0) {
			return -1;
		}else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}
	
	
	//size
	public static int size() {
		return size;
	}
	
	//empty
	public static int empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//top
	public static int top() {
		if(size == 0) {
			return -1;
		}else {
			return stack[size - 1];
		}
	}
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
