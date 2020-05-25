package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SapientTest {

	public static void main(String[] args) {
		RestrictedMap<Integer,Integer> map=new RestrictedMap<Integer,Integer>();
		for(int i=0;i<10;i++) {
			System.out.println(map.put(i, i));
		}
		
		Map<Integer, Integer> map1= new HashMap<Integer, Integer>(){{
			put(2,3);
		}};
		
		List<Integer> list=new LinkedList<Integer>() {{
			add(6);
			add(9);
		}};
		
		
	}

}
