package features;

import interfaces.Counter;
import interfaces.Stack;

public class StackCounterFeature extends StackFeature implements Counter, Stack {	
	int i = 0;
	
	public void reset() {
		i = 0; 
	}
	
	public void inc() {
		i = i + 1; 
	} 
	
	public void dec() { 
		i = i - 1; 
	}
	
	public int size() { 
		return i; 
	}
	
	// Lift SF to CF
	public void empty() {
		this.reset();
		super.empty();
	}
	
	public void push(char a) {
		this.inc(); // From Counter
		super.push(a);
	}
	
	public void pop() {
		this.dec();
		super.pop();
	}

}
