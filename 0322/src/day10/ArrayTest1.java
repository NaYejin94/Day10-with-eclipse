package day10;

public class ArrayTest1 {
	public static void main(String[] args) {
		/*
		  ���� - ������ �� ���� �����ϱ� ���� �޸� ����
		  
		  �迭 - ������ Ÿ���� �����͸� ���� �� ���� �� �� �ִ� �����
		  	    ������ => �迭�� �̸��� �ּҰ�(������)�� ��
		  	    �ݺ����� ó���� ȿ����
		  	    �迭�� ��ҵ��� index(÷��)�� ���ٰ���
		  	    index�� 0���� ����
		  	    �迭 ��Ҵ� default������ �ʱ�ȭ��
		 */
		//1. �迭 ����, �޸� �Ҵ�, �ʱ�ȭ�� ����
		// �迭 ���� - �ڷ���[] �迭��;
		int[] arr;

		//�޸� �Ҵ�
		arr = new int[3]; //3���� ��Ҹ� ��� �迭

		//�ʱ�ȭ
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;

		//2. �迭 ����� �޸� �Ҵ��� 䤷�ÿ
		int[] arr2 = new int[2];

		//�ʱ�ȭ
		arr2[0]=1;
		arr2[1]=4;

		//3. �迭����, �޸� �Ҵ�, �ʱ�ȭ�� ��� ���ÿ�
		int[] arr3 = {3, 6, 8, 5};

		//�Ǵ�
		int[] arr4 = new int[] {1, 2, 3, 4, 7, 9};

		//�Ǵ�
		int[] arr5;
		arr5 = new int[] {3, 4, 6, 7, 9};

		//
		int[] arr6;
		arr6 = new int[3];
		//arr6 = {1, 2, 5} //error


		//�迭 ��ҿ� ����, �迭 ��� ���
		/*
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);
		 System.out.println(arr[2);
		 */
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}//for

		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}//for

		System.out.println("length : "+arr2.length);

		for(int i=0;i<arr6.length;i++) {
			System.out.println(arr6[i]);
		}


	}
}
