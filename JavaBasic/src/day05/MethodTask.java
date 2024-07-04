package day05;

public class MethodTask {

	public static void main(String[] args) {
		// return의 다른 사용법
		// 반복문의 break처럼 탈출의 용도로도 사용된다.
		
		int[] data = new int[]{1, 3, 2, 0, 4, 5};
		int result = sum(data);
		System.out.println(result);
		
		
	}
	
	
	// nums = {1, 3, 2};
	public static int sum(int[] nums) {
		int result = 0;
		
		// 만약 전달받은 파라미터의 길이가 0이라면
		// 정상적이지 않은 데이터를 처리하는 부분
//		if(nums.length == 0) {
//			return 0;
////			System.out.println("반환 이후");
//		}
		
		// 메인 로직
		// 향상된 for문(foreach)
		for (int num : nums) { // nums 배열의 요소를 하나씩 num 변수에 담아
			// 임시적으로 for문 안에서 사용한다.
			if(num < 0) { // 만약 현재 반복에서 num에 담긴 값이 음수라면
				// 이전까지 합한 값만 반환한다.
				return result;
			}
			// 현재 반복의 num값이 음수가 아니라면
			// 기존 합(result)에 num 값을 더한다.
			result += num;
		}
		
		// 정상적인 처리 후 정해진 값 반환
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
