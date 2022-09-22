
/**
 *  A description of WordFrequencies here.
 *  Determine the word that occurs the most often in a file.
 *  If more than one word occurs as the most often, then return 
 *  the first such word found. You will make all words lowercase 
 *  before counting them. 
 * @author (YUSUF CAGRI DAL) 
 * 
 */
import edu.duke.*;
import java.util.ArrayList;

public class WordFrequencies {
    
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs; //store the integer arraylist to calculate how many times has been seen a word
    
      public WordFrequencies() {
          myWords = new ArrayList<String>(); //to be able to hold strings
          myFreqs = new ArrayList<Integer>();
        }
         
    public void findUnique() { 
        myWords.clear();
        myFreqs.clear();
        FileResource Resource = new FileResource("testwordfreqs.txt"); // to open up this file
        for(String s: Resource.words()){ //looks over every word
            s = s.toLowerCase(); //convert to lowercase
            int index = myWords.indexOf(s); 
            if(index == -1){//if the word has been seen before we added to myWords.
                myWords.add(s);
                myFreqs.add(1);
            }
            else {
                int freq = myFreqs.get(index); //if seen before calculate how many times seen by increaseing and setting again, we access the value in my freqs.
                myFreqs.set(index,freq+1); //we set the value by + 1
            }
        }
    }
    
    
    public void tester() {
        findUnique(); 
        System.out.println("# unique words: "+myWords.size());
        
        for ( int k =0; k < myWords.size();k++){
            System.out.println(myFreqs.get(k)+"\t"+ myWords.get(k)); //print the number of occurance and word itself
        }
        int index = findIndexOfMax();
        System.out.println("max word/freq: " +myWords.get(index)+" "+
        myFreqs.get(index));
        
        
    }
     
    public int findIndexOfMax() {
        int max = myFreqs.get(0);
        int maxIndex = 0;
        for(int k=0; k < myFreqs.size(); k++) {
            if (myFreqs.get(k) >max) {
                max = myFreqs.get(k);
                maxIndex = k;
            }
            
        }
        return maxIndex;
        }

}
