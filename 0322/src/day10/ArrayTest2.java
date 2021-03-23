package day10;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] arr = {90, 88, 87, 56, 72, 100, 99, 65};

		System.out.println("변경 전 점수");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}//for

		//5점 가산 후 출력
		//int a=90;
		//a+=5;

		System.out.println("\n============= 5점 가산 후 ==============");

		for(int i=0;i<arr.length;i++) {
			//5점 가산
			arr[i]+=5;
			if(arr[i]>100) {
				arr[i]=100;
			}
			//출력
			System.out.print(arr[i]+"\t");
		}//for


	}

}
