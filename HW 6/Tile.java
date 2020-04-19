/**
* Represents a Tile which can be in the bag or held by a player
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Tile implements Comparable<Tile>, Comparator<Tile>, Cloneable {
	/** the letter represented */
	private Character letter;

	/** the score for this letter */
	private Integer score;

	/** The position on the board */
	private Position position;
	
	/**
	 * Creates the default letter '-' with a score value of 0.
	 */
	public Tile(){
		this('-', 0);
	}
	/**
	 * Inits the <param>letter</param> and gives a score of 1
	 * @param character
	 */
	public Tile(Character letter) {
		// Always make sure it's uppercase
		this.letter = Character.toUpperCase(letter);
		// Get the score from the map
		this.score = LetterMap.map.get(Character.toUpperCase(letter));
	}
	public Tile(Character letter, Integer score) {
		this.letter = letter;
		this.score = score;
	}
	public Character getLetter() {
		return letter;
	}
	public void setLetter(Character letter){
		this.letter = letter;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score){
		this.score = score;
	}
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public String toString() {
		return letter.toString() + "[" + score + "]";
	}
	public Object clone() {
		return new Tile(new Character(this.getLetter()), new Integer(this.getScore()));
	}
	public boolean equals(Tile tile) {
		return ( (this.getLetter().compareTo(tile.getLetter()) == 0) &&
			 (this.getScore() == tile.getScore()) );
	}

        /*
         * Comparisons based on the score of the tiles
         */
	public int compare(Tile tile1, Tile tile2) {
		if (tile1.getScore() < tile2.getScore()) {
			return -1;
		}
		else if (tile1.getScore() == tile2.getScore()) {
			return 0;
		}
		else {
			return 1;
		}
	}

        /*
         * Comparisons based on the letter
         */
	public int compareTo(Tile tile) {
            return this.getLetter().compareTo(tile.getLetter());
	}
}
