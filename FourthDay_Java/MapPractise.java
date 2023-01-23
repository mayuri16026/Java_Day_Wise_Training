package com.FourthDayJava;
import java.util.*;

public class MapPractise {

	public static void main(String[] args) 
	{
		
		MapPractise.myHashMap1();
		MapPractise.myHashMap2();
		MapPractise.myHashMap3();
		

	}

	public static void myHashMap1()
	
	{
		//Non-generic style..
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(100, "hello");
		map.put(102,"hii");
		map.put(103, "heyy");
		
		 //Traversing Map  
	    Set set=map.entrySet();
	    //Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        
	    //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	}
}
	
	public static void myHashMap2()
	{
		//Generic style..
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Advika");  
		  map.put(101,"Vijaykumar");  
		  map.put(102,"Rajnandini");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
	
	public static void myHashMap3()
	{
		
		
	}
	}
	

	

