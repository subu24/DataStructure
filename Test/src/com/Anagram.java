package com;

public class Anagram {

	public static void main(String[] args) {
		String str="ghhgggi76jhbmnbmbnnh";
		String str1="ghhgggi76jhbmnbmbnnh";
		
		System.out.println(checkAnagram(str.toCharArray(),str1.toCharArray()));
	}

	private static boolean checkAnagram(char[] str1, char[] str2) {
		int[] count= new int[256];
		if(str1.length!=str2.length) {
			return false;
		}
		
		for(int i=0;i<str1.length;i++) {
			count[str1[i]]++;
			count[str2[i]]--;
		}
		
		for(int i=0;i<256;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
	}

}
