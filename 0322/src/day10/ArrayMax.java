package day10;

public class ArrayMax {
	public static void main(String[] args) {
		//�迭�� ����� �ִ밪 ���ϱ�
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

		System.out.println("\n\n�ִ밪 : "+max);

		float f = 84.362f;

		//�Ҽ����� 1�ڸ��� ǥ���ϱ�
		/*
		  [1] *`10 -��3
		  845.72r
		  [2] �ݿø� Math.round(84.62f)
		  [3] /10f
		  84.6f
		 */
		float f2 = Math.round(f*10)/10f;
		System.out.println(f2);

	}
}
