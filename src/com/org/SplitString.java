package com.org;

public class SplitString {
	String name="abcd is learned everyday";
	public void display() {
		String[] sp=name.split(" ");
		int n=sp.length;
		String rev="";
		
	for(String sp1:sp) {
		System.out.println(sp1);
	}
	for(int i=n-1;i>=0;i--) {
	rev=rev+sp[i];	
	}
	System.out.println(rev);
	}

	public static void main(String[] args) {
		
SplitString ss=new SplitString();
ss.display();
	}

}
