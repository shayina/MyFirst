package com.org;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=0;i<=1;i++)
		{
			for(int j=1;j<=i;j++) {
				for(int k=1;k<=j;k++) {
					System.out.println("*"); 
				}
				System.out.println("&"); 
			}
			System.out.println("%"); 
		}

	}

}
