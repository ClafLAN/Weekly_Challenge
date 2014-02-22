import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Original Question: Ever had an English composition professor who actually 
 * counted the words in your term papers to make sure that you did not exceed 
 * the limit? After you get an “F” on a 5001 word paper because it was supposed 
 * to be a 5000 word paper, a few things come to your mind: What sort of 
 * pathetic life does this person lead that causes them to COUNT 5001 WORDS?? 
 * How can I keep this from happening again? Write a program that processes a 
 * text file and calculates the number of words it contains. A word is simply a 
 * sequence of non-blank, non-punctuation characters.
 * 
 * Your program should take its input from the text file words.dat This file 
 * contains arbitrary text delimited by the punctuation marks: 
 * . , ; : ! ? 
 * In addition to punctuation marks, text is also delimited by blank spaces.
 * 
 * @author scipio
 */
public class WordCount {

    private static Pattern word = Pattern.compile("\\w+");
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wordCount = 0;
        
        while(input.hasNext())
            wordCount += countWords(input.nextLine());
        
        System.out.printf("Document contains %d words.%n", wordCount);
    }
    
    public static int countWords(String line) {
        Matcher counter = word.matcher(line);
        int count = 0;

        while(counter.find())
            count++;
        
        return count;
    }
}
