public class StringExploration{
   public static void main (String[]args){
      String w = "sign up for advanced programming";
   //print w in ALL CAPS
      System.out.println(w.toUpperCase());
      System.out.println(w);
      //String methods are immutable
      System.out.println(w.contains("up"));
      if(w.indexOf("down")>-1)
         System.out.println("true");
      else
         System.out.println("false");
      if(w.indexOf("up")>-1)
         System.out.println("true");
      else
         System.out.println("false");
      //-1 not there
      System.out.println(w.length()-1);
      System.out.println("the index at the character for is "+w.indexOf("for"));
      //print out the character located at index 10
      System.out.println("the character at index 10 is "+w.charAt(10));
      //print out w starting just after "ad"
      //w.substring(8); start at 8 and go to end - for advanced programming
      //w.substring(8,14); start at and will not touch 14 - for ad
      System.out.println(w.substring(w.indexOf("ad")+2));
      //print out w starting after the first letter a up to the second letter g
      System.out.println(w.substring(w.indexOf("a")+1,w.indexOf("g",w.indexOf("g")+1)));
   }
}