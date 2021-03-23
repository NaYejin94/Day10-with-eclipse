package day10;

public class ArrayTest1 {
	public static void main(String[] args) {
		/*
		  변수 - 데이터 한 개를 저장하기 위한 메모리 공간
		  
		  배열 - 동일한 타입의 데이터를 여러 개 저장 할 수 있는 저장소
		  	    참조형 => 배열의 이름은 주소값(참조값)이 들어감
		  	    반복적인 처리가 효율적
		  	    배열의 요소들으 index(첨자)로 접근가능
		  	    index는 0부터 시작
		  	    배열 요소는 default값으로 초기화됨
		 */
		//1. 배열 선언, 메모리 할당, 초기화률 따로
		// 배열 선언 - 자료형[] 배열명;
		int[] arr;

		//메모리 할당
		arr = new int[3]; //3개의 요소를 담는 배열

		//초기화
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;

		//2. 배열 선언과 메모리 할당으 甚렘첼
		int[] arr2 = new int[2];

		//초기화
		arr2[0]=1;
		arr2[1]=4;

		//3. 배열선언, 메모리 할당, 초기화를 모두 동시에
		int[] arr3 = {3, 6, 8, 5};

		//또는
		int[] arr4 = new int[] {1, 2, 3, 4, 7, 9};

		//또는
		int[] arr5;
		arr5 = new int[] {3, 4, 6, 7, 9};

		//
		int[] arr6;
		arr6 = new int[3];
		//arr6 = {1, 2, 5} //error


		//배열 요소에 접근, 배열 요소 출력
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
