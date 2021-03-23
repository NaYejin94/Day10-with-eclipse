package day10;

public class ArrayMax {
	public static void main(String[] args) {
		//배열에 저장된 최대값 구하기
		int[] arr = {10, 57, 17, 35, 77, 26};

		int max = arr[0];//10

		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max=arr[i];
			}
		}//for

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}

		System.out.println("\n\n최대값 : "+max);

		float f = 84.362f;

		//소수이하 1자리만 표시하기
		/*
		  [1] *`10 -ㅣ3
		  845.72r
		  [2] 반올림 Math.round(84.62f)
		  [3] /10f
		  84.6f
		 */
		float f2 = Math.round(f*10)/10f;
		System.out.println(f2);

	}
}
