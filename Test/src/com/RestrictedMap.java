package com;

import java.util.HashMap;

public class RestrictedMap<K,V> extends HashMap<K, V>{

	private HashMap<K,V> map=null;
	
	public RestrictedMap() {
		map=new HashMap<K,V>();
	}

	
	public V put(K key, V value){
		if(map.size()>7) {
			return null;
		}else {
			map.put(key, value);
			return value;
		}
	}
}
