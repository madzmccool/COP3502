// the class Word defines a "word" in Scrabble

import java.util.*;

public class Word implements Comparable<Word>{
    ArrayList<Tile> tiles; // the list of tiles

    // constructors
    public Word() {
        tiles = new ArrayList<Tile>();
    }

    public Word(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

    // get/set methods
    public ArrayList<Tile> getTiles() {
        return this.tiles;
    }

    public void setTiles(ArrayList<Tile> tiles) {
        this.tiles = tiles;
    }

    // helper method - creates a word from a string passed in
    public void fromString(String str) {
        tiles = new ArrayList<Tile>(); // reset the array list
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            // create new Tile
            Tile t = new Tile(c);
            // add it to the arraylist
            tiles.add(t);
        }
    }

    // compareTo method
    public int compareTo(Word word) {
        // get the sizes
        int size1 = tiles.size();
        int size2 = word.getTiles().size();

        // determine if one is bigger than the other
        if (size1 > size2) {
            for (int i = 0; i < size1; i++) {
                if (i == size2 - 1) // reached the last tile of the second word, so first word is bigger
                    return 1;
                else {
                    // get the tiles to compare                   
                    Tile tile1 = this.getTiles().get(i); 
                    Tile tile2 = word.getTiles().get(i); 
                                                                  
                    // if they are the same, go to the next tiles
                    if (tile1.compareTo(tile2) == 0)
                        continue;
                    else
                        return tile1.compareTo(tile2);
                }
            }
        }
        else if (size2 > size1) { // 2nd word is longer
            for (int i = 0; i < size2; i++) {
                if (i == size1 - 1) // reached the last tile of the first word, so second word is bigger
                    return -1;
                else {
                    // get the tiles to compare                   
                    Tile tile1 = this.getTiles().get(i); 
                    Tile tile2 = word.getTiles().get(i); 
                                                                  
                    // if they are the same, go to the next tiles
                    if (tile1.compareTo(tile2) == 0)
                        continue;
                    else
                        return tile1.compareTo(tile2);
                }
            }
        }
        else { // sizes are equal, just compare the tiles individually
            for (int i = 0; i < size1; i++) {
                // get the tiles to compare
                Tile tile1 = this.getTiles().get(i); 
                Tile tile2 = word.getTiles().get(i); 

                // if they are the same, go to the next tiles
                if (tile1.compareTo(tile2) == 0) {
                    //System.out.println("Continuing for " + tile1 + " and " + tile2);
                    continue;
                }
                else
                    return tile1.compareTo(tile2);
            }

            // if broke out of loop, means they are equal
            return 0;
        }

        return 1;
    }

    // as string
    // returns the word as a lowercase string
    public String asString() {
    	String str = "";
    	for (int i = 0; i < tiles.size(); i++) {
            str += Character.toLowerCase( ((Tile)(tiles.get(i))).getLetter());
        }
    	return str;
    }
    
    // toString
    public String toString() {
        String str = "";
        for (int i = 0; i < tiles.size(); i++) {
            str += ( (Tile)(tiles.get(i))).toString();
        }

        return str;
    }
    
    // equals
    public boolean equals(Word word) {
    	if (this.compareTo(word) == 0)
    		return true;
    	else
    		return false;
    }
}
