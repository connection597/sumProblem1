package sumProblem;

import java.util.Scanner;

//입력 받은 숫자의 합 구하기 (while,flag)
public class sum1 {

	public static void main(String[] args) {
	     int num ;
	     int sum =0;
	     boolean flag = true;
	     
	     System.out.println("합계를 구할 숫자 입력 하세요.(끝내려면 0을 입력하세요)");
	     Scanner sc = new Scanner(System.in);
	     while(flag) {
	    	 System.out.println(">>");
	    	 num =sc.nextInt();
	    	 
	    	 if(num != 0) {
	    		 sum +=num;
	    	 }else {
	    		 flag = false;
	    	 }
	     }
	     System.out.println("합계는"+sum+"입니다");
	     System.out.println("프로그램을 종료합니다");
	     sc.close();
	     System.exit(0);
	}

}
