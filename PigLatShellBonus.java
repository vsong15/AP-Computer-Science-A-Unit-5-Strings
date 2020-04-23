import java.util.Scanner;
public class PigLatShellBonus
{
   public static void main(String[]args)
   {
      Scanner kb=new Scanner(System.in);
      while(true){
         System.out.println("Enter a sentence to piggify! Add a space after every word! (or 1 to quit)");
         String word=kb.nextLine();
         if(word.equals("1"))
            break;
      
         int counter = 0;
         int x = 0;
         int [] words = new int[word.length()];   
       
         for( int i=0; i< word.length(); i++ ) {
          
            if(word.charAt(i) == ' ' ) {
               words[x] = i;
               x++;
               counter++;
            }
         }
       
         System.out.print(word+"in Pig Latin is: ");
         for(int i = 0; i < counter; i++){
            int y = counter;
            if(y == 0){ //one word
               String pigWord=toPig(word);
               System.out.println(word +" in Pig Latin is: "+pigWord);
            }
            else {//more than one word
               if(i == 0 )
                  System.out.print(toPig(word.substring(0,words[i]))+" "); //1st word
               if( i > 0 && i != (counter - 1)) // middle words
                  System.out.print(toPig(word.substring(words[i-1]+1, words[i]))+" ");
               if(i== (counter-1)&& i!=0) // last word
                  System.out.print(toPig(word.substring(words[i-1]+1, words[i])));           
            }
         } 
         System.out.println("\n");
      }
   }
   //return if a specific letter is a vowel
   public static boolean isVowel(String v)
   {
      return(v.equalsIgnoreCase("a")||v.equalsIgnoreCase("e")||v.equalsIgnoreCase("i")||v.equalsIgnoreCase("o")||v.equalsIgnoreCase("u"));  
   }
   
   //return the index of the first vowel in a word (-1 if no vowel)
   public static int firstVowel(String f)
   {
      //is vowel
      for(int i = 0; i < f.length(); i++){
         if(isVowel(f.substring(i,i+1)))
            return i;
      }
      return -1;  
   }
   
   //returns the PigLatin version of w.
   public static String toPig(String w)
   {
      //first vowel 
      int first = firstVowel(w);
      
      if(first < 1){
         return w+"yay";
      }    
      return w.substring(first)+w.substring(0,first)+"ay";
   }  
}