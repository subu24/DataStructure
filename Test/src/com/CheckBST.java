package com;

class Node{
	int data;
	Node left;
	Node right;
}
public class CheckBST {
	//	5
	 //4
	//3       7         
//		4.5
	
	boolean isBST(Node root,Node r,Node l) {
		
		if(root==null) {
			return true;
		}
		
		if(l!=null && root.data<l.data) {
			return false;
		}
		
		if(r!=null && root.data>r.data)
			return false;
		
		boolean b1= isBST(root.left,root,l);
		
		boolean b2=isBST(root.right,root,r);
		return b1 && b2;
	}
	
}
