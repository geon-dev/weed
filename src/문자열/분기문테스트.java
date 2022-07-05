package 문자열;

public class 분기문테스트 {

	public static void main(String[] args) {
	
//		break테스트();
		
//		continue테스트();
		
		return테스트();
	}

	private static void return테스트() {
		// 현재 진행 중인 루프를 중단하고 다음 루프로 건너뛰어 진행하도록 하는 구문
		
		int k = 0;
		
		outer: 
		for (int i = 0; i < 5; i++) { // outer for
			System.out.println("for1 / " + i);
			
			for (int p = 0; p < 5; p++) { // inner for
				k++;

				if (k == 13) {
					System.out.println(" 벗어남 ");
					return;
				}else if(k == 23) {
					System.out.println(" outer 벗어남 ");
					return;
				}
				
				System.out.println("	for2 / " + p + " / k = " + k);
			}
		}
		
	}

	private static void continue테스트() {
		// 현재 진행 중인 루프를 중단하고 다음 루프로 건너뛰어 진행하도록 하는 구문
		
		int k = 0;
		
		outer: 
		for (int i = 0; i < 5; i++) { // outer for
			System.out.println("for1 / " + i);
			
			for (int p = 0; p < 5; p++) { // inner for
				k++;

				if (k == 13) {
					System.out.println(" 벗어남 ");
					continue;
				}else if(k == 23) {
					System.out.println(" outer 벗어남 ");
					continue outer;
				}
				
				System.out.println("	for2 / " + p + " / k = " + k);
			}
		}

		
	}

	private static void break테스트() {
		//한번에 가장 가까운 하나의 Loop를 벗어날 때 사용된다.
		
		int k = 0;
		
		outer: 
		for (int i = 0; i < 5; i++) { // outer for
			System.out.println("for1 / " + i);
			
			for (int p = 0; p < 5; p++) { // inner for
				k++;

				if (k == 13) {
					System.out.println(" 벗어남 ");
					break; // 하나의 Loop를 벗어남
				}else if(k == 23) {
					System.out.println(" outer 벗어남 ");
					break outer;
				}
				
				System.out.println("	for2 / " + p + " / k = " + k);
				
				// break[label] : label이 포함된 Loop문까지 break;함
			}
		}
	}
	
	
	
	
	
	
	
}
