package com.innerclass.jsp;

public class staticinnerclass {
	public static  class B{
		static int a=10;
		int c=100;
		public void m1() {
			System.out.println("static innerclass in m1() method");
		}
		public static void m2() {
			System.out.println("static method in innerclass");
		}
	}
		
	

}
