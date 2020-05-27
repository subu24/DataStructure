package com;

import java.util.Stack;

public class StackMinimum {

	int minElement;
	Stack<Integer> st;
	StackMinimum(){
		st=new Stack<Integer>();
	}
	public static void main(String[] args) {

		StackMinimum s = new StackMinimum(); 
        s.push(3); 
        s.push(5); 
       // s.getMin(); 
        s.push(2); 
        s.push(1); 
        s.getMin(); 
        s.pop(); 
        s.getMin(); 
        s.pop(); 
       // s.peek(); 
		
	}

	private void getMin() {
		System.out.println(minElement);
	}
	void push(int item) {
		if(st.empty()) {
			st.push(item);
			minElement=item;
		}else {
			if(minElement<= item) {
				st.push(item);
			}else {
				int t= (2*item)-minElement;
				st.push(t);
				minElement=item;
			}
		}	
		System.out.println("Number Inserted"+item);
	}
	
	void pop() {
		if(st.empty())
			System.out.println("Stack is empty");
		
		int t=st.pop();
		if(t<minElement) {
			System.out.println(minElement);
			minElement=(2*minElement)-t;
		}else
			System.out.println("Item deleted"+t);
	}
}
