package com.test;

import java.util.ArrayList;

public class Colletcion1 {
public static void main(String[] args) {
	ArrayList al1 =new ArrayList();
	al1.add(45);
	al1.add("yogesh");
	ArrayList al=new ArrayList();
	al.add(56);
	al.add(23);
	
	al.addAll(al1);
	System.out.println(al);
}
}
