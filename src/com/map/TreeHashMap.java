package com.map;

import java.util.*;

public class TreeHashMap {
	public static void main(String[] args) {
		
		//Description : Create a TreeHashMap with the below key and values
        //key    : !,@,#,$,%,^,&,*,(,
        //Values : 10,20,30,40,50,60,10,50,40
		
		Map m = new TreeMap();
		m.put("!",10);
		m.put("@",20);
		m.put("#",30);
		m.put("$",40);
		m.put("%",50);
		m.put("^",60);
		m.put("&",10);
		m.put("*",50);
		m.put("(",40);
		
		System.out.println(m);
	


	}

}
