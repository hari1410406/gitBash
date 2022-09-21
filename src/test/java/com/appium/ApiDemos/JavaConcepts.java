package com.appium.ApiDemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class JavaConcepts {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add(10);
		list.add("hello");
		list.add('a');
		System.out.println(list);
		list.add(2,true);
		System.out.println(list);
		
		
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("hhhh");
		arr.add("sss");
		list.addAll(arr);
		System.out.println(list);
		arr.addAll(list);
		System.out.println(arr);
		
		
		ArrayList< Object> s=new ArrayList<Object>();
		s.add(10);
		s.add("hello");
		s.add('a');
		if(s.contains('a')) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
		
		ArrayList<Integer> myNumbers=new ArrayList<Integer>();
		myNumbers.add(10);
		myNumbers.add(30);
		myNumbers.add(50);
		myNumbers.add(67);
		myNumbers.add(54);
	//	for(Integer number:myNumbers) {
	//		System.out.println(number);
	//	}
		Collections.sort(myNumbers);
		System.out.println(myNumbers);
	
	
	ArrayList<Object> rt=new ArrayList<Object>();
	rt.add("10");
	rt.add("bye");
	rt.add(89);
//	rt.removeAll(myNumbers);
	//rt.retainAll(arr);
	//arr.retainAll(rt);
//	System.out.println(rt);

	myNumbers.retainAll(rt);
	//System.out.println(myNumbers);
	System.out.println(arr.get(1));
	
	Vector<String> vec=new Vector<String>(4);
	vec.add("deer");
	vec.add("hhhi");
	System.out.println("size is :"+vec.size());
	System.out.println("Default capscity is "+vec.capacity());
	System.out.println("vector element is"+vec);
	
	vec.addElement("horse");
	vec.addElement("bird");
	System.out.println("size after addition:"+vec.size());
	System.out.println("Default capscity after addition is "+vec.capacity());
	
	if(vec.contains("deer")) {
		System.out.println("it is present:"+vec.indexOf("deer"));
		System.out.println("presence  "+vec.indexOf("horse", 0));
	}
	else {
		System.out.println("deer is there");
	}
	System.out.println("las animal "+vec.lastElement());
	System.out.println("first animal "+vec.firstElement());
	
      Vector<Object> v=new Vector<Object>();
      v.add(20);
      v.add(51);
      v.add(7);
      Enumeration e=v.elements();
      while(e.hasMoreElements()) {
    	  System.out.println(e.nextElement());
    	 // System.out.println(e.asIterator());
    	  
      }
	}}
