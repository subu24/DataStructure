package com.rakuten;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RakutenTest {


		public static void main(String args[] ) throws Exception {
			 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int test=Integer.parseInt(br.readLine());
	        Map<String,Integer> map=new HashMap<String,Integer>();
	        String str=br.readLine();
	        String[] val=str.split(" ");
	        for(int i=0;i<test;i++){
	            if(map.containsKey(val[i])){
	                map.put(val[i],map.get(val[i])+1);
	            }else{
	                map.put(val[i],1);
	            }
	        }
	        int sum=0;
	        for(Map.Entry<String,Integer> e : map.entrySet()){
	            if(e.getValue()%2==0)
	                sum=sum+Integer.parseInt((String) e.getKey());
	        }
	        System.out.println(sum);
	    }		 
	

}
