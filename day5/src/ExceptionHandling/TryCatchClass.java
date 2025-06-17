package ExceptionHandling;

import java.util.Arrays;

public class TryCatchClass {
	
	public static void main(String[]args) {
		int[] arr = new int [5];
		System.out.println(Arrays.toString(arr));
		try {
			
			int div = 10/0;
			arr[10] = 12;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println("Infinite");
			
		}finally {
			System.out.println("try program completed");
		}
		
		System.out.println(Arrays.toString(arr));
	}
	

}
