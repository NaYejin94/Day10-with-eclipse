package day10;

public class ArrayCopy {
	public static void main(String[] args) {
		//배열 변수의 복수 - 참조형이므로 같은 메모리 영역을 가리키게 됨
		int[] arr = {10,20,30};
		int[] row = arr; //arr과 row배열은 같은 인스턴스를 가리킴(주소가 같다)

		arr[0]++;

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		System.out.println("\n=========row배열 요소=============");

		for(int i=0;i<row.length;i++) {
			System.out.println(row[i]);
		}

		//배열 복사를 이용한 swap
		int[] arr2 = {1,3,5,7,9};
		int[] arr3 = {20,40,60};

		System.out.println("\n\narr2의 주소 :"+arr2+
									", arr3의 주소:"+arr3);

		int[] temp =arr2;
		arr2 = arr3;
		arr3 = temp;

		System.out.println("swap 후 arr2 배열 요소");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println("\n\nswap 후 arr3 배열 요소");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}

		System.out.println("\n\nswap 후 arr2의 주소 :"+arr2+
				", arr3의 주소:"+arr3);
	}
}
