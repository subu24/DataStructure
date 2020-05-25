package com;

import java.util.Arrays;

public class MergerTwoArray {

	public static void main(String[] args) {

		String[] arr1= {"a","c","d","f","g"};
		String[] arr2= {"e","b","h"};
		String[] arr3=mergeArray(arr1,arr2);
		
		Arrays.stream(arr3).forEach(System.out::println);		
		
	}

	static String[] mergeArray(String[] a,String[] b) {
		
		Arrays.sort(b);
		int m=a.length;
		int n=b.length;
		String[] merge= new String[m+n]; 
		int i = 0, j = 0, k = 0; 
        while (i < m && j < n) { 
            if (a[i].compareTo(b[j])<0) { 
				merge[k] = a[i]; 
                i += 1; 
                k += 1; 
            } else { 
            	merge[k] = b[j]; 
                j += 1; 
                k += 1; 
            } 
        }     
          
        while (i < m) {                 
        	merge[k] = a[i]; 
            i += 1; 
            k += 1; 
        }     
        while (j < n) {   
        	merge[k] = b[j]; 
            j += 1; 
            k += 1; 
        } 
        return merge;
	}
}
