package features;

import interfaces.Counter;
import interfaces.Lock;
import interfaces.Stack;

public class StackCounterLockFeature extends StackCounterFeature implements Lock, Counter, Stack {
	
	boolean I = true;
	
	public void lock() { 
		I = false; 
	}
	
	public void unlock() { 
		I = true; 
	} 
	
	boolean is_unlocked() { 
		return I; 
	} 
	
	// Lift CF to LF
	public void reset() {
		if(this.is_unlocked()) {
			super.reset();
		}
	}
	
	public void inc() {
		if(this.is_unlocked()) {
			super.inc();
		}
	}
	
	public void dec() {
		if(this.is_unlocked()) {
			super.dec();
		}
	}
	
	// Lift SF to LF
	public void empty() {
		if(this.is_unlocked()) {
			super.empty();
		}
	}
	
	public void push(char a) {
		if(this.is_unlocked()) {
			super.push(a);
		}
	}
	
	public void pop() {
		if(this.is_unlocked()) {
			super.pop();
		}
	}
	

}
