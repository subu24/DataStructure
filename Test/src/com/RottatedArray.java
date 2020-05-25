package com;

import java.io.BufferedReader;
import java.util.Scanner;

import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;

public class RottatedArray {

	public static void main(String[] args)  throws Exception{

		int[] arr= {1,2,3,4,5};
		int l=arr.length;
		int clockWiseOrNot=1;
		int r=3,i;
		if(clockWiseOrNot==0) {
		for(int j=0;j<r;j++)	{
		int temp=arr[0];
		for(i=0;i<l-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[i]=temp;
		}
		}else {
			for(int j=0;j<r;j++)	{
				int temp=arr[l-1];
				for(i=l-1;i>0;i--) {
					arr[i]=arr[i-1];
				}
				arr[i]=temp;
			}
		}
		
		for(int t:arr)
			System.out.println(t);
	}
	
	
	

}
