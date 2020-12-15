package sumProblem;

public class Quiz {
//배열 값의 평균 구하기
	public static void main(String[] args) {
		int []arr = {50,56,98,46,53,68,88,95};
		int sum =0;
		for(int i =0; i <arr.length; i++) {
			sum +=i;
		}
		System.out.println(String.format("합계는 %d", sum));
		System.out.println(String.format("평균은 %, 1f",
				((double)sum/(arr.length))));	
	}

}
