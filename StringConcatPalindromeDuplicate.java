// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
class HelloWorld {
    public static void main(String[] args) {
      
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the first String");
      String stra=sc.nextLine();
      System.out.println("Enter the second String");
      String strb=sc.nextLine();
      
      String strc= stra+strb;
      System.out.println(strc);
      
      boolean resultpalin= checkpalin(strc);
      if(resultpalin==true){
          System.out.println("yes," + strc +"it is a palindrome");
      }else{
          System.out.println("nooo it is not palindrome");
          String resultfinal=removeduplicates(strc);
          System.out.println(resultfinal);
      }
    }
    
     public static boolean checkpalin(String strc){
        
        int start=0;
        int end=strc.length()-1;
        
        while(start<=end){
            if(strc.charAt(start)==strc.charAt(end))
            {
                start++;
                end--;
                
            }
            else{
                
             return false;
            }
            
          
            
        }
          return true;
    }
    
    public static String removeduplicates(String strc){
        Set<Character>seen=new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for(char ch: strc.toCharArray()){
            if(!seen.contains(ch)){
                result.append(ch);
                seen.add(ch);
            }
        }
        return result.toString();
    }

}
