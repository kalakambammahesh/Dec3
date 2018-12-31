package com.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams2 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int[] lettersCount = new int[26];
		for(char c : arr1) {
			lettersCount[c - 'a']++;
		}
		
		for(char c : arr2) {
			lettersCount[c - 'a']--;
		}
		int result = 0;
		for(int i : lettersCount) {
			result += Math.abs(i);
		}
		
		System.out.println(result);
		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
		
//		Map<Character, Integer> map1 = new LinkedHashMap<>();
//		Map<Character, Integer> map2 = new LinkedHashMap<>();
//		
//		int len1 = arr1.length;
//		for(int i = 0;i < len1;i++) {
//			if(map1.containsKey(arr1[i])) {
//				int n = map1.get(arr1[i]);
//				map1.put(arr1[i], n + 1);
//			}else {
//				map1.put(arr1[i], 1);
//			}
//		}
//		
//		int len2 = arr2.length;
//		for(int i = 0;i < len2;i++) {
//			if(map2.containsKey(arr2[i])) {
//				int n = map2.get(arr2[i]);
//				map2.put(arr2[i], n + 1);
//			}else {
//				map2.put(arr2[i], 1);
//			}
//		}
//		
//		int count = 0;
//		int check = 0;
//		if(len1 < len2 || len1 == len2) {
//			for(int i = 0;i < len1;i++) {
//				check++;
//				System.out.println(arr1[i]);
//				System.out.println(map2.containsKey(arr1[i]));
//				if(map1.containsKey(arr1[i]) && map2.containsKey(arr1[i])){
//					System.out.println("in if");
//					count = count + Math.abs(( map1.get(arr1[i]) - map2.get(arr1[i])));
//				}else {
//					System.out.println("Count++");
//					count++;
//				}
//			}
//		}else {
//			
//		}
		
		//count += map2.size() - check;
		//System.out.println(count);
		
		/*for(int i = 0;i < len1;i++) {
			if(map2.containsKey(arr1[i])) {
				count += (map1.get(arr1[i]) - map2.get(arr1[i]));
			}else {
				count++;
			}
		}*/
		
		/*for(int i = 0;i < len2;i++) {
			if(map1.containsKey(arr2[i])) {
				count += (map1.get(arr2[i]) - map2.get(arr2[i]));
			}else {
				count++;
			}
		}*/
		//System.out.println(count);
	}

}
