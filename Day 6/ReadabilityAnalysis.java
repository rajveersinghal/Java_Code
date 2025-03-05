import java.util.Scanner;
public class ReadabilityAnalysis {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter text: ");
          String str=s.nextLine();
          
         int characters= countCharacters(str);
         int sentences=countSentences(str);
         int words=countWords(str);
         int syllables=countSyllables(str);

          //Flesch-Kincaid score
          double readabilityScore=206.385 -(1.015*((double)words/sentences))-(84.6*((double)syllables/words));
          String category;

          //Readability catrgory
          if(readabilityScore>=90)
          {
            category="Very Easy";
          }
          else if(readabilityScore>=80)
          {
            category="Easy";
          }
            else if(readabilityScore>=70)
            {
                category="Fairly Easy";
            }
            else if(readabilityScore>=60)
            {
                category="Standard";
            }
            else if(readabilityScore>=50)
            {
                category="Fairly Difficult";
            }
            else if(readabilityScore>=30)
            {
                category="Difficult";
            }
            else
            {
                category="Very Confusing";
            }

            System.out.println("\n--- Readability Analysis ---");
            System.out.println("Total Characters: " + characters);
            System.out.println("Total Words: " + words);
            System.out.println("Total Sentences: " + sentences);
            System.out.println("Total Syllables: " + syllables);
            System.out.println("Readability Score: " + readabilityScore);
            System.out.println("Readability Level: " + category);
    }
        // Fntn to count characters 
    public static int countCharacters(String text) {
        return text.replaceAll("\\s+", "").length();
    }

    // Fntn to count words 
    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    // Fntn to count sentences 
    public static int countSentences(String text) {
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    // Fntn to count syllables (approximation)
    public static int countSyllables(String text) {
        String[] words = text.split("\\s+");
        int syllableCount = 0;
        String vowels = "aeiouyAEIOUY";
    
        for (String word : words) {  
            int count = 0;
            //this will remove all numerics,puncuations etc...
            word = word.toLowerCase().replaceAll("[^a-z]", ""); 
    
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
    
                if (vowels.indexOf(c) != -1) 
                { 
                    // If character is a vowel
                    if (i == 0 || vowels.indexOf(word.charAt(i - 1)) == -1) {
                        count++; 
                    }
                }
            }
    
            // Handle silent 'e' at the end
            if (word.endsWith("e") && count > 1) {
                count--;
            }
    
            // it ensures  at least one syllable per word
            syllableCount += Math.max(count, 1);
        }
        return syllableCount;
    }
}
