package com.inter;

import java.util.Scanner;

public class AlternatingCharacters {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int testCases = sc.nextInt();
		
		while(testCases-- > 0) {
			String str = sc.next();
			int len = str.length();
			
			int deletions = 0;
			for(int i = 0;i < len;i++) {
				char c = str.charAt(i);
				for(int j = i + 1;j < len;j++) {
					if(c == str.charAt(j)) {
						i++;
						deletions++;
					}else {
						break;
					}
				}
			}
			System.out.println(deletions);
		}

	}

}
