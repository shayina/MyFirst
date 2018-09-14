package com.org;

import java.util.List;
import java.util.Scanner;

public class SimpleArray {
	public static void main(String[] args) {
		String old="hex,aw,a,r,e";
		String news=old.replace(",", "");
		System.out.println(news);
		char ch[]= {'H','e','x','a','w','a','r','e'};
		String s=new String(ch);
		System.out.println(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		int n=str.length()
;		for(int i=n-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		 
		
		
	}

}
