import java.util.Scanner;
public class NonRep{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
  for(int i=0;i<a.length();i++){
      if(a.indexOf(a.charAt(i))==a.lastIndexOf(a.charAt(i))){
          System.out.println(a.charAt(i));
          break;
      }
  }  
    
    }

}
