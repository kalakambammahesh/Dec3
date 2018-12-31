package com.inter;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountSwapsInBubblesort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
    	int len = a.length;
    	int endPosition = len - 1;
    	int swapPosition, count = 0;
    	
    	while(endPosition > 0) {
    		swapPosition = 0;
    		
    		for(int i = 0;i < len-1;i++) {
    			if(a[i] > a[i+1]) {
    				//swap
    				count++;
    				int temp = a[i];
    					a[i] = a[i+1];
    					a[i+1] = temp;
    					swapPosition = i;
    			}
    		}//End of For
    		endPosition = swapPosition;
    	}//End Of While
    	System.out.println("Array is sorted in " + count + " swaps.");
    	System.out.println("First Element: " + a[0] + "\n" + "Last Element: " + a[len-1]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
       
        
        for(int i = 0;i < n;i++) {
        	arr[i] = scanner.nextInt();
        }

        countSwaps(arr);

        scanner.close();
    }
}
