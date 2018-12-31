package com.inter;

import java.util.Scanner;

public class HackSortingPra {
	private static final Scanner sc = new Scanner(System.in);
	
	public static int[] subArray(int[] a, int i, int len) {
		int[] subArray = new int[len];
		
		int count = 0;
		for(int j = i;j < len;j++) {
			subArray[count] = a[j];
			count++;
		}
		
		return subArray;
	}
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int notification = 0;
		int dinc = d;
		for(int i = 0;i < n-1;i++) {
			    int[] subArray = subArray(arr, i, d);
				int median = 0;
				if(subArray.length >= d) {
					if(d % 2 != 0) {
						median = subArray[d/2];
					}else {
						median = (subArray[d-1/2] + subArray[d+1/2])/2;
					}
				}
				
				if(arr[dinc-2] >= 2 * median) {
					notification++;
				}
				dinc++;
		}
		System.out.println(notification);
	}

}
