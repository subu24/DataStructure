package com;

public class SearchFiniteArray {

	 public static void main(String[] args)  
	    { 
	        int arr[] = new int[]{3, 5, 7, 9, 10, 90,  
	                            100, 130, 140, 160, 170}; 
	        int ans = findIndex(arr,90); 
	          
	        if (ans==-1) 
	            System.out.println("Element not found"); 
	        else
	            System.out.println("Element found at index " + ans); 
	    } 
	
	static int findIndex(int[] arr,int k) {
		int l=0;
		int h=1;
		int v=arr[0];
		while(v<k) {
			l=h;
			if(2*h<arr.length) {
				h=2*h;
			}else {
				h=arr.length-1;
			}
			v=arr[h];
		}
		return bSearch(arr,l,h,k);
	}


	private static int bSearch(int[] arr, int l, int h, int k) {
		
		if(h>=l) {
		int mid=l+(h-l)/2;
		
		if(arr[mid]==k) {
			return mid;
		}
		if(arr[mid]>k){
			return bSearch(arr,l,mid-1,k);
		}
			return bSearch(arr,mid+1,h,k);
		}	
		return -1;
	}
}
