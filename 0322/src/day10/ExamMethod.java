package day10;

import java.util.Scanner;

public class ExamMethod {

	public static String func1(int a, int b){
		String result="";
		if(a>=20 && b<=0) {
			result = "���ȸ��";
		}else {
			result = "�Ϲ�ȸ��";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ŷ�Ƚ���� ��üȸ���� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();

		String result = func1(a,b);
		System.out.println(result);
	}

}
