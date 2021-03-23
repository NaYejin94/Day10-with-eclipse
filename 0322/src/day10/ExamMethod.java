package day10;

import java.util.Scanner;

public class ExamMethod {

	public static String func1(int a, int b){
		String result="";
		if(a>=20 && b<=0) {
			result = "우수회원";
		}else {
			result = "일반회원";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("거래횟수와 연체회수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();

		String result = func1(a,b);
		System.out.println(result);
	}

}
