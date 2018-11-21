package lifters;

import features.FeatureLF_on_CF_on_SF;

public class FeatureCF {
	
	public static void main(String[] args) {
		FeatureLF_on_CF_on_SF myFeature = new FeatureLF_on_CF_on_SF();

		myFeature.unlock();
		
		// Setup Stack
		myFeature.push('A');
		myFeature.push('R');
		myFeature.push('A');
		myFeature.push('R');
		myFeature.push('A');
		
		// Test inheritance and implements
		myFeature.push1('!');
		System.out.println("My original Stack: " + myFeature.printString());
		System.out.println("Stack size: " + myFeature.size());
		myFeature.lock();
		myFeature.push('X');
		System.out.println("Stack after LOCK and PUSH: " + myFeature.printString());
		myFeature.unlock();
		myFeature.pop();
		myFeature.pop();
		System.out.println("Stack after UNLOCK & 2 pops: " + myFeature.printString());
		
		
		// Reset
		myFeature.lock();
		myFeature.reset();
		System.out.println("Stack after LOCK & RESET: " + myFeature.size());
		myFeature.unlock();
		myFeature.reset();
		myFeature.empty();
		System.out.println("Stack after UNLOCK & RESET: " + myFeature.size());
		System.out.println("Final Stack: " + myFeature.printString());
	}
}
