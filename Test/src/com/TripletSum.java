package com;

import java.util.Arrays; 
  
class TripletSum 
{ 
static void printTriplets(int arr[], 
                          int n, int sum) 
{ 
    Arrays.sort(arr); 
    for (int i = 0; i < n - 2; i++)  
    { 
        int j = i + 1, k = n - 1; 
        while (j < k)  
        { 
            if (arr[i] + arr[j] + arr[k] > sum) 
                k--; 
            else
            { 
            	if(arr[i] + arr[j] + arr[k] == sum) {
              
                    System.out.println(arr[i] + ", " + arr[j] + ", " +  arr[k]); 
            	}
                j++; 
            } 
        } 
    } 
} 
  
public static void main(String args[]) 
{ 
    int arr[] = { 2, 3, 1, 5, 4 }; 
    int n = arr.length; 
    int sum = 9; 
    printTriplets(arr, n, sum); 
} 
} 

