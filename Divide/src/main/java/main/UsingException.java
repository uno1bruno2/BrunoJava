package main;

public class UsingException {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		if (y == 0) {
			throw new ArithmeticException();
		}

//		UsingException reference = new UsingException();
//		System.out.println(reference.divide());
		
	}
	
//	public int divide() {
//		try {
//			int num1 = 3;
//			int num2 = 3;
//			return num1/num2;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			return 0;
//		} finally {
//			System.out.println("fish");
//		}
//	}

}
