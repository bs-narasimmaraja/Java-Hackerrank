package com.innerclass.jsp;

public class driverclassformethodreferemce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodreference s=new methodreference();
		A1 a=s::test;
		a.m1();
	}

}
