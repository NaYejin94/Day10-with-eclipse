package day10;

import java.util.Scanner;

/*
 오버로딩 메서드
 - 하나의 클래스내에서 동일한 이름을 가진 메서드
 단 매개변수의 개수나 자료형이 달라야한다
*/
public class OverloadingTest {

	public static int add(int a, int b) {
		int result=a+b;
		return result;
	}

	public static double add(double a, double b) {
		double result=a+b;
		return result;
	}

	public static String add(String a, String b) {
		return a+b;

	}

	/*public static String add(int a, int b) { 
		//오버로딩 메서드 아님 - 리턴타입으로는 구별하지 않음!
		int result=a+b;
		return Integer.toString(result);
	}*/

	public static void main(String[] args) {
		int n = add(10,20);
		System.out.println(n);

		double d1=3.14, d2=4.56;
		double d=add(d1,d2);
		System.out.println(d);

		Scanner sc = new Scanner(System.in);
		System.out.println("연결하려는 문자열 두 개 입력!");
		String s1=sc.nextLine();
		String s2=sc.nextLine();

		String s = add(s1,s2);
		System.out.println(s);
	}

}
