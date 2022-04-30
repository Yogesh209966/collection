package com.test;

import java.util.ArrayList;

public class Collection2 {
	public static void main(String[] args) {
		ArrayList al1 =new ArrayList();
		al1.add(45);
		al1.add("yogesh");
		ArrayList al2=new ArrayList();
		al2.add(56);
		al2.add(244);
		ArrayList al=new ArrayList();
		al.addAll(al1);
		al.addAll(al2);
		System.out.println(al);
		
	}

}
