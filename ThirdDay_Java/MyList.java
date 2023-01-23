package com.ThirdDayJava;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyList 
{
	public static void main(String[]args)
	{
		
		MyList.myArrayList();
	}
//	public void myArrayList1()
//	{
		public static void myArrayList()
		{
			//List list=new ArrayList();
			List<String>list=new ArrayList<String>();
			
			list.add("nisha");
			list.add("ranu");
			list.add("mayura");
			list.add("Asha");
			
			System.out.println(list);
		
		
			
			System.out.println("simple for");
			for(int i=0;i<list.size();i++) 
			{
				
			
				String name=list.get(i);
				System.out.println(name);
				
			}
			
			System.out.println("using advance");
			
			for(String name :list)
			{
				System.out.println(name);
				
			}
		
			
			System.out.println("using iterator");
			Iterator<String>itr=list.iterator();
			{
			while(itr.hasNext() ){
				String name=itr.next();
				System.out.println(name);
			}
			
			
			System.out.println("using list iterator");
			ListIterator<String> litr=list.listIterator();
			while(litr.hasNext())
			{
				String name=(String)litr.next();
				System.out.println(name);
			}
			
			//Collections.sort(list);
			System.out.println("After sorting");
			while(litr.hasPrevious())
			{
				String name=(String)litr.previous();
				System.out.println(name);
			}
			
		}
	}
}
	
	
				
			
		




