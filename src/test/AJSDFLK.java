package test;

import java.util.*;

public class AJSDFLK {

	public static void main(String[] args) {
	
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		solution(board, moves);
/*
[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]	
[1,5,3,5,1,2,1,4]	
4		
 */
		
	}
	
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int length = board.length;
        // 열마다 stack 관리?
        // 바구니 stack
        
        int[][] data = new int[length][];
        for(int i=0; i < data.length; i++) {
        	data[i] = new int[data.length];
        }
        
        for(int i=0; i < length; i++) {
        	int[] arr = board[i];
        	
//        	System.out.println(Arrays.toString(arr));
        	
        	for(int p=0; p < arr.length; p++) {
        		int v = arr[p];
//        		System.out.println(i + "/" + p + " = " + v);
        		
        		data[p][i] = v;
        	}
        }
        
//        System.out.println(Arrays.toString(data[0]));
//        System.out.println(Arrays.toString(data[1]));
//        System.out.println(Arrays.toString(data[2]));
//        System.out.println(Arrays.toString(data[3]));
//        System.out.println(Arrays.toString(data[4]));
//        System.out.println(Arrays.toString(moves));
        
        // move
        Stack<Integer> st = new Stack<>();
        for(int i=0; i < moves.length; i++) {
        	int v = moves[i];
        	
//        	System.out.print(v + " >뽑기> ");
        	// 1 >> index는 0 
        	// 해당값중 0 이 아닌 값 빼오기 > 빼고 0 넣기
        	
        	for(int p=0; p < data[v-1].length; p++) {
        		int w = data[v-1][p];
        		
        		if(w != 0) {
//        			System.out.print(w);
        			data[v-1][p] = 0;
        			
        			// 바구니에 있으면 확인하고 터트리기
        			if(st.isEmpty()) {
        				st.push(w);
        			}else {
        				int check = st.peek();
        				if(check == w) {
        					// 터트리기
        					st.pop();
        					answer = answer + 2;
        				}else {
        					st.push(w);
        				}
        			}
        			
        			break;
        		}
        	}
//        	System.out.println();
        }
        
//        System.out.println("바구니 = " + st);
//        System.out.println("count = " + answer);
        
        return answer;
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
