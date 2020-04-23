import java.util.Scanner;
public class PigLatShell
{
   public static void main(String[]args)
   {
      Scanner kb=new Scanner(System.in);
      while(true){
         System.out.println("enter a word to piggify! (or 1 to quit)");
         String word=kb.nextLine();
         if(word.equals("1"))
            break;
         String pigWord=toPig(word);
         System.out.println(word +" in Pig Latin is: "+pigWord);
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