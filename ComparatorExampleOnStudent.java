package com.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student{
	String name, address;
	int rollNo;
	
	Student(int rollNo, String name, String address){
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
	}
	
	public String toString() {
		return this.name + " " + this.address + " " + this.rollNo;
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

class SortByRollNo implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.rollNo - s2.rollNo;
	}
}

public class ComparatorExampleOnStudent {

	public static void main(String[] args) {
		ArrayList<Student> ar = new ArrayList<>();
		
		ar.add(new Student(111, "bbbb", "london")); 
        ar.add(new Student(131, "aaaa", "nyc")); 
        ar.add(new Student(121, "cccc", "jaipur")); 
        
        int len = ar.size();
        for(int i = 0;i < len;i++) {
        	System.out.println(ar.get(i));
        }
        
        Collections.sort(ar, new SortByName());
        
        for(int i = 0;i < len;i++) {
        	System.out.println(ar.get(i));
        }
        
        Collections.sort(ar, new SortByRollNo());
        
        for(int i = 0;i < len;i++) {
        	System.out.println(ar.get(i));
        }
	}

}
