/**
 * Madeleine Godette
 * Section: 11053
 * Assignment:  HW #5 - OurDictionary
 * Due: April 10,2019 (origionally 8th)
 */
import java.util.ArrayList;
class OurDictionary {
    /**
     *  One general thing to remember is that we do not need to understand absolutely
     *  everything about what we have been given. We only need to know that we can make 
     *  list of words (because they are objects and we can make an 
     *  ArrayList out of -any- object) and that these things are comparable
     *  (so we can check if one word equals another).
     *  That is all we need to know about Word/Tile to make our methods.
     */
    
    ArrayList<Word> words;
   
    public OurDictionary() {
        words = new ArrayList<Word>();
    }
    
    public void addWord(Word word) {
        words.add(word);

    }
    
    public int linearSearchIterative(Word word) {
        
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).equals(word)) //checks if the letter in the current place is a match
            return i;
        }
       
        return -1;
    }
    
    public int linearSearchRecursive(Word word) {
        
         for(int i = 0; i < words.size(); i++){
             if (words.get(i).equals(word)){ //checks if letter is equal
                 return i;
                } else if (i == words.size() - 1) //checks if it is the size 
                return -1;
            }
            return linearSearchRecursive(word); //recursive step
                //return -1;
            }
}
