package test;

public class CheckTime {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		for(int i=0; i < 100; i++) {
			for(int q=0; q < 100; q++) {
				System.out.println("a");
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) / 1000.0);
	}

}
