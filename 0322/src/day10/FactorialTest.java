package day10;

/*
재귀 호출(recursive call)
- 메서드 내부에서 메서드 자기자신을 다신 호출하는 것
- 반복적인 작업을 해야 하는 메서드에 반복문 대신사용
*/

public class FactorialTest {

	/*
	 팩토리얼
	 4! = 4*3*2*1
	 =>4! = 4*3!
	 
	 f(n) = n*f(n-1); 단 f(1)=1
	 */


	public static int factorial(int n) {
		int result = 0;

		if(n==1) {
			result=1;
		}else {
			result=n*factorial(n-1);
			/*
			 4*f(3)
			   3*f(2)
			     2*f(1)
			       1
			 */
		}

		return result;
	}

	/*public static int fib(int n) {
		int result=0;
		for(int i=0;i<10;i++) {
			if(n<2) {
				return n;
			}
			result = fib(n-2) + fib(n-1);
		}
		return result;
	}*/

	public static int fibonacci(int num) {
		if(num==0)
			return 0;
		else if(num==1)
			return 1;
		else
			return fibonacci(num-2)+fibonacci(num-1);
					 //f(0)+f(1), f(1)+f(2)
			         //0 + 1,       1 + f(0)+f(1)
			         //            1 + 0 + 1  
	}

	public static void main(String[] args) {
		int res = factorial(4);
		System.out.println("4! = "+res);

		/*int res2 = fib(10);
		System.out.println(res2);*/

		for(int i=0;i<10;i++) {
			int num = fibonacci(i);
			System.out.println(num);
		}
	}


}
