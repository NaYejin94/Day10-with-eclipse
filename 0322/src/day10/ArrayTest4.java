package day10;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] arr = new int[5]; //�迭����� �޸��Ҵ�

		//5, 10, 15, 20, 25
		//for�� �ȿ��� �迭 �ʱ�ȭ�ϱ�
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1)*5;
		}//for

		//���
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


		//����ڷκ��� double�� 4�� �Է� �޾Ƽ� �迭�� �ֱ�
		double[] dArr = new double[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ� 4���� �Է��ϼ���");

		//for������ �ʱ�ȭ
		for(int i=0;i<dArr.length;i++) {
			dArr[i] = sc.nextDouble();
		}//for

		//���
		for(int i=0;i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}//for
	}

}
