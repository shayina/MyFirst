package com.org;

import java.util.Scanner;

public class StringDemo {
	String name;
	public void strFun() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		name=sc.next();
		String name1=name.toUpperCase();
		String sub=name.substring(1, 4);
		String rev="";
	for(int i=name.length()-1;i>=0;i--)
	{
	rev=rev+name.charAt(i);
	}
System.out.println(rev);
System.out.println(name1);
System.out.println(sub);
	}
	
	public static void main(String[] args) {
		StringDemo sd=new StringDemo();
		sd.strFun();
		
	}
	

}
