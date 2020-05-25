package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortString {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hsfh");
		list.add("asaa");
		list.add("xcxb");
		list.add("hsfh");
		list.add("asaa");
		int allCount=0;
		String check=null;
		 HashMap<String,Integer> charFreqMap = new HashMap<>();
		for(String str : list) {
			if(charFreqMap.containsKey(str)) {
	            int count = charFreqMap.get(str);
	            charFreqMap.put(str,count+1);
	            if(allCount<count+1) {
	            	allCount=count+1;
	            	check=str;
	            	//System.out.println(check);
	            }else if(allCount==count+1){
	            	if(check.compareTo(str)<1) {
	            		check=str;
	            		System.out.println(check);
	            	}
	            }
	         } else {
	        	 charFreqMap.put(str,1);
	         }
	      }	
		System.out.println(check);
	}
	public int numIslands(List<List<Integer>> grid, List<Integer> queries) {
	    if(grid==null || grid.size()==0||grid.get(0).size()==0)
	        return 0;
	 
	    int m = grid.size();
	    int n = grid.get(0).size();
	    Map<Integer,Integer> map=new HashMap<Integer, Integer>();
	    int count=0;
	    for(int i=0; i<m; i++){
	        for(int j=0; j<n; j++){
	            if(grid.get(i).get(j)=='1'){
	                count++;
	                merge(grid, i, j);
	                map.put(count,1);
	            }
	        }
	    }
	 List< Integer> l=new ArrayList<Integer>();   
	 for(Integer i:queries) {
		 if(map.containsKey(i)) {
			 l.add(map.get(i));
		 }
	 }
	    return count;
	}
	 
	public void merge(List<List<Integer>> grid, int i, int j){
		int m = grid.size();
	    int n = grid.get(0).size();
	 
	    if(i<0||i>=m||j<0||j>=n||grid.get(i).get(j)!='1')
	        return;
	 
	    grid.get(i).set(j, 0);
	 
	    merge(grid, i-1, j);
	    merge(grid, i+1, j);
	    merge(grid, i, j-1);
	    merge(grid, i, j+1);
	}
}
