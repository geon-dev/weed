package begginer;

import java.util.*;
import java.io.*;

/*
 * https://www.acmicpc.net/problem/10845
 * 
 * 자료구조 - 큐
 * 
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 */
public class Q10845 {

	public static void main(String[] args) throws IOException {
		/*
		 * queue 이용
		 * stringbuiler 이용
		 * stringtokenizer 이용
		 * 
		 */
	}
	
	
	public static void main2(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> ll = new ArrayList<Integer>();
		
		//명령의 수 N 
		int N = Integer.parseInt(br.readLine());

		//둘째 줄부터 N개의 줄에는 명령
		// for N
		for(int i = 0; i < N; i++) {
			String command = br.readLine();
			
			if(command.contains("push")) {
				//push X: 정수 X를 큐에 넣는 연산이다.
				int ii = Integer.parseInt(command.split(" ")[1]);
				
				ll.add(ii);
			}else if(command.equals("pop")) {
				//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				
				if(ll.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.println(ll.get(0));
					ll.remove(0);
				}
			}else if(command.equals("size")) {
				//size: 큐에 들어있는 정수의 개수를 출력한다.
				System.out.println(ll.size());
				
			}else if(command.equals("empty")) {
				//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
				if(ll.size() == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(command.equals("front")) {
				//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(ll.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.println(ll.get(0));
				}
				
			}else if(command.equals("back")) {
				//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(ll.size() == 0) {
					System.out.println("-1");
				}else {
					System.out.println(ll.get(ll.size() - 1));
				}			
			}
		

		}
		
	}
	
	
	
}
