package sumProblem;
//array 합계예제
public class Quiz1 {

	public static void main(String[] args) {
		int scorelist[] = {100,85,65,35,90,73};
		String[] sublist = {"국어","영어","도덕","사회","과학","체육"};
		
		int sum =0;
		for(int i =0; i<scorelist.length; i++) {
			sum +=scorelist[i];
			System.out.println(sublist[i]+":"+ scorelist[i]);
		}
		System.out.println("----------------");
		System.out.println("총점:"+sum);
		System.out.println("평균 :" + sum/scorelist.length);
	}

}
