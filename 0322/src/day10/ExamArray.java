package day10;

import java.util.Scanner;

public class ExamArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열의 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for(int i=0;i<num;i++) {
			arr[i] = i;
			System.out.println("arr["+i+"] = "+arr[i]);
		}//for

		System.out.println();

		int[] arr2 = new int[5];

		for(int i=0;i<5;i++) {
			arr2[i]=i*2+1;
			System.out.print(arr2[i]+" ");
		}//for

	}

}
