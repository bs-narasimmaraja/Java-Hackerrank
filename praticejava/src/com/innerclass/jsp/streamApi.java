package com.innerclass.jsp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class streamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,3,4,53,7};
		int[] b= {2,3,6,7,88};
		
		IntStream i1=IntStream.of(a);
		IntStream i2=IntStream.of(b);
		
		int[] c=IntStream.concat(i1, i2).distinct().sorted().toArray();
		
		System.out.println(Arrays.toString(c));
	}

}
