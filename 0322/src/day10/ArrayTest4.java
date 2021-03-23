package day10;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int[] arr = new int[5]; //배열선언과 메모리할당

		//5, 10, 15, 20, 25
		//for문 안에서 배열 초기화하기
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1)*5;
		}//for

		//출력
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


		//사용자로부터 double값 4개 입력 받아서 배열에 넣기
		double[] dArr = new double[4];
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 4개를 입력하세요");

		//for문에서 초기화
		for(int i=0;i<dArr.length;i++) {
			dArr[i] = sc.nextDouble();
		}//for

		//출력
		for(int i=0;i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}//for
	}

}
