package day10;

public class ArrayTeset3 {
	public static void main(String[] args) {
		float[] farr; //배열선언
		farr = new float[3]; //메모리 할당

		//초기화
		farr[0]=12.5f;
		farr[1]=-24.3f;
		farr[2]=0.76f;

		/*System.out.println("farr[0]="+farr[0]);
		System.out.println("farr[1]="+farr[1]);
		System.out.println("farr[2]="+farr[2]);*/

		//출력
		for(int i=0;i<farr.length;i++) {
			System.out.println("farr["+i+"]"+farr[i]);
		}

		//배열선언, 메모리할당, 초기화 동시에
		double[] arr = {89.0, 90.0, 76.0, 60.0};

		double total=0;
		for(int i=0;i<arr.length;i++) {
			total += arr[i];
		}
		double avg = total/arr.length;

		System.out.println("\n총점: "+total+", 평균: "+avg+"\n");

		String[] arr2 = new String[3]; //배열선언, 메모리할당 동시에
		arr2[0] = "a";
		arr2[1] = "b";
		arr2[2] = "c";

		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

		char[] cArr = new char[4];
		cArr[0]='j';
		cArr[1]='a';
		cArr[2]='v';
		cArr[3]='a';

		for(int i=0;i<cArr.length;i++) {
			System.out.print(cArr[i]);
		}
	}
}
