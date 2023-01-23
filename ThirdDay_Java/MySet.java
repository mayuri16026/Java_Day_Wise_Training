package com.ThirdDayJava;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MySet.myHashSet();
	}
	public static void myHashSet()
	{
		Set<String>set=new HashSet<String>();
		set.add("ram");
		set.add("manu");
		set.add("bingo");
		System.out.println(set);
	}

}
