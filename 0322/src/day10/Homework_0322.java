package day10;

//������

import java.util.Scanner;

public class Homework_0322 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// [p.43]
		int[] arr = new int[8];

		while(true) {
			System.out.println("�����Ǹ��� ��ȣ(1~8)�� ���� �Ǹŷ��� �Է��ϼ���.(�������� Q)");
			String str1 = sc.nextLine();
			if(str1.equalsIgnoreCase("Q")) break;
			String str2 = sc.nextLine();

			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			arr[(num1-1)] += num2;

			System.out.println("�׷��ȣ : "+num1+", �Ǹŷ� : "+arr[(num1-1)]);
		}


		System.out.println("\n====================================\n");


		// [p.44]

		System.out.println("������ ���ڿ��� �Է��ϼ���");
		String str3 = sc.next();
		int num = str3.length();

		char[] sArr = new char[num];

		for(int i=0;i<str3.length();i++) {
			sArr[i] = str3.charAt(i);
			System.out.println("str.charAt("+i+"):"+sArr[i]+"=>"+(int)sArr[i]);
		}

	}

}
