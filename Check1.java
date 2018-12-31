package com.inter;

public class Check1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(10/0); {ArithmeticException : / by zero}
		//System.out.println(0/10); {0}
		//System.out.println(10/0.0); {Infinity}
		//System.out.println(-10/0.0); {-Infinity}
		//System.out.println(0/0); {ArithmeticException : / by zero}
		//System.out.println(0.0/0); {NaN}
		//System.out.println(0/0.0);
		String s1 = new String("Mahesh");
		String s2 = new String("mahesh");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
