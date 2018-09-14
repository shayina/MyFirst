package com.org;


import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		List<Integer> abc=new ArrayList<Integer>();
		List<Integer> ex=new ArrayList<Integer>();
		abc.add(10);
		abc.add(20);
		abc.add(30);
		
		System.out.println(abc);
		int n=abc.size();
		for(int i=0;i<=n-1;i++)
		{System.out.println(abc.get(i));}
			
		for(Integer xyz:abc) {
			System.out.println(xyz);}
 ex.addAll(abc);
 System.out.println(ex);
	}

}
