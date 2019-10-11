package edu.smith.cs.csc212.adtr;

import edu.smith.cs.csc212.adtr.real.JavaMap;
import edu.smith.cs.csc212.adtr.real.JavaSet;

public class Challenges {
	
	

	// The union of two sets is the set of elements that either contains.
	public static SetADT<Integer> union(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
		// For loop to include all items in the left list
		for (Integer n: left) {
			output.insert(n);
			//For loop to include all items in right list
			for (Integer m: right) {
				if (output.contains(m)==false) {
					output.insert(m);
				}
			}
		}	
			return output;
		
	}
	
	// The intersection of two sets is the set of elements that both contain.
	public static SetADT<Integer> intersection(SetADT<Integer> left, SetADT<Integer> right) {
		SetADT<Integer> output = new JavaSet<>();
			// include all items in left list if they are in the right list
			for (Integer Y: left) {
				if (right.contains(Y)) {
					output.insert(Y);
				}
			}
		return output;
	}
	
	// Count the words in the input list and put them in the map.
	public static MapADT<String, Integer> wordCount(ListADT<String> words) {
		MapADT<String, Integer> output = new JavaMap<>();
		// Count the items and return this count with the word corresponding
		int count=0;
		for (int g=0; g<words.size(); g++) { 
			count+=1;
			output.put(words.getIndex(g), count);
		}		
		return output;

	}
	
	

}
