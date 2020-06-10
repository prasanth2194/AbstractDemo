package com.prasanth.string;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletions {
	
	
	
	static int minDeletions(String s){
		
		Set<Character> set = new HashSet<Character>(); 
		for(int i=0;i<s.length();i++){
			Character c=s.charAt(i);
			set.add(c);
		}
		return s.length()-set.size();
	}

	public static void main(String[] args) {
		System.out.println(minDeletions("aebaecedabbee"));
		

	}

}
