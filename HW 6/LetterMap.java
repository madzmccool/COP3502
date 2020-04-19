// The purpose of this class is to store the Scrabble mappings from Letter to Score
// Created for Project 5 so that we can easily look up the value of a Letter

import java.util.*;

public class LetterMap {
	
	/** Mapping from the Letter to the Score **/
	static final HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	
	// initialize the map
	static {
		map.put('E', 1);
		map.put('A', 1);
		map.put('I', 1);
		map.put('O', 1);
		map.put('N', 1);
		map.put('R', 1);
		map.put('T', 1);
		map.put('L', 1);
		map.put('S', 1);
		map.put('U', 1);
		map.put('D', 2);
		map.put('G', 2);
		map.put('B', 3);
		map.put('C', 3);
		map.put('M', 3);
		map.put('P', 3);
		map.put('F', 4);
		map.put('H', 4);
		map.put('V', 4);
		map.put('W', 4);
		map.put('Y', 4);
		map.put('K', 5);
		map.put('J', 8);
		map.put('X', 8);
		map.put('Q', 10);
		map.put('Z', 10);
		map.put('_', 0);
	}
}
