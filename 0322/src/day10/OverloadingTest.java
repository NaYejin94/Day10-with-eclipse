package day10;

import java.util.Scanner;

/*
 �����ε� �޼���
 - �ϳ��� Ŭ���������� ������ �̸��� ���� �޼���
 �� �Ű������� ������ �ڷ����� �޶���Ѵ�
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
		//�����ε� �޼��� �ƴ� - ����Ÿ�����δ� �������� ����!
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
		System.out.println("�����Ϸ��� ���ڿ� �� �� �Է�!");
		String s1=sc.nextLine();
		String s2=sc.nextLine();

		String s = add(s1,s2);
		System.out.println(s);
	}

}
