package com.innerclass.jsp;

public class driverclassforanonmous {

	
		anonymousclass b=new anonymousclass() {
		public void taste() {
			System.out.println("icecream is creamy");
		}
	}
		public static void main(String[] args) {
		anonymousclass b=new anonymousclass() {
			public void taste() {
				System.out.println("icecream is salty");
				
			}
		}
		b.taste();


}
}
