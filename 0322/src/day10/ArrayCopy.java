package day10;

public class ArrayCopy {
	public static void main(String[] args) {
		//�迭 ������ ���� - �������̹Ƿ� ���� �޸� ������ ����Ű�� ��
		int[] arr = {10,20,30};
		int[] row = arr; //arr�� row�迭�� ���� �ν��Ͻ��� ����Ŵ(�ּҰ� ����)

		arr[0]++;

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println("\n=========row�迭 ���=============");

		for(int i=0;i<row.length;i++) {
			System.out.println(row[i]);
		}

		//�迭 ���縦 �̿��� swap
		int[] arr2 = {1,3,5,7,9};
		int[] arr3 = {20,40,60};

		System.out.println("\n\narr2�� �ּ� :"+arr2+
									", arr3�� �ּ�:"+arr3);

		int[] temp =arr2;
		arr2 = arr3;
		arr3 = temp;

		System.out.println("swap �� arr2 �迭 ���");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println("\n\nswap �� arr3 �迭 ���");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}

		System.out.println("\n\nswap �� arr2�� �ּ� :"+arr2+
				", arr3�� �ּ�:"+arr3);
	}
}
