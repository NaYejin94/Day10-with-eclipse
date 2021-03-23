package day10;

import java.util.Scanner;

public class ExamOverloading {

	public static int func(int a,int b) {
		int r = a*b;
		return r;
	}

	public static double func(int a,int c, double b) {
		double r = a*b*c;
		return r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로, 세로, 반지름을 입력하세요");
		int w = sc.nextInt();
		int h = sc.nextInt();
		int r = sc.nextInt();

		int res1 = func(w,h);
		double res2 = func(r,r,3.14);

		System.out.println("사각형의 면적 : "+res1);
		System.out.println("원의 면적 :"+res2);
	}

}
