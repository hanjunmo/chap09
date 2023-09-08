package com.example;

public class SleepExample {
	
	/*
	 * Error
	 * 1. 컴파일 에러(문법 에러)
	 * 2. 싱행시에 발생하는 에러(Exceprion)
	 * 
	 * Exceprion
	 * 1. Compiler Checked Exception    (Exceprion) 
	 * 2. Compiler UnChecked Exceotion  (RuntimeException)
	 * 
	 */
	
	
	public static void main(String[] args) {
		String str = null;
		
		System.out.println(str.toUpperCase());
		
		NullPointerException x = new NullPointerException();
	}
	
	public static void main3(String[] args) {
		int num = 100;
		int result = num / 0;   // Unchecked Exception;
		
	    System.out.println("result=" + result);
	    ArithmeticException x;
	}
	
	public static void main2(String[] args) {
		
		System.out.println("10초 후에 종료 됩니다.");
		
		InterruptedException x;
		
//		Thread.sleep(10000);
		
//		SQLException s;
		
//		DriverManger.getConnection("");
		
		System.out.println("종료됨.");

	}

}
