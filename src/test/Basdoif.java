package test;

public class Basdoif {

	public static void main(String[] args) {
		
//		int[] nums = {1,2,3,4};
		int[] nums = {1,2,7,6,4};
		System.out.println(solution(nums));
		
	}

	/*
[1,2,3,4]	1
[1,2,7,6,4]	4

3개를 더해서 소수
	 */

    static int solution(int[] nums) {
        int answer = -1;

        
        // 소수?
        // 안나눠지는수 : 1,2는소수인가?
        // 3 5 7 11 13
        // 3개덧셈 .. -- // 나눠서 떨어지나
        
//        System.out.println(check(nums));
        answer = check(nums);
//        System.out.println(13/2);
//        System.out.println(9/2);

        return answer;
    }
    
    static int check(int[] nums) {

        // 3개 for문?
    	int count = 0;
        for(int i=0; i < nums.length; i++) {
        	for(int p=i+1; p < nums.length; p++) {
        		for(int q=p+1; q < nums.length; q++) {
        			int sum = nums[i] + nums[p] + nums[q];
//        			System.out.println(i + "/" + p + "/" + q);
//        			System.out.println("sum=" + sum);
        			
        			// 반값의 +1 로 나누기
        			int div = (sum/2) + 1;
        			boolean isCheck = false;
        			while(div-- > 2) {
//        				System.out.println(sum + "/" + div + "=" + (sum % div));
        				if(sum % div == 0) {
        					isCheck = true;
        				}
        			}
        			
        			if(isCheck) { // 나눠짐
//        				System.out.println(sum + " = 나눠짐");
        			}else { // 안나눠짐
//        				System.out.println(sum + " = 안나눠짐");
        				count++;
        			}
        			
        		}
        	}
        }
        
        return count;
    }
	
	
}
