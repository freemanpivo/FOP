package features;

import interfaces.Stack;

public class FeatureSF implements Stack{
	String s = new String();
	
	public void empty() { 
		s = ""; 
	} 
	
	public void push(char a) {
		s = String. valueOf(a). concat(s); 
	}
	
	public void pop() {
		s = s. substring(1); 
	}
	
	public char top() { 
		return (s. charAt(0)); 
	} 
	
	public void push1 (char a) {
		this.push(a); 
		this.push(a); 
	} 
	
	public String printString() {
		return this.s;
	}

}
