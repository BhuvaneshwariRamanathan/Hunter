import java.util.Scanner;
import java.util.regex.*;
public class VowelFirst{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
String a=s.nextLine();
String ans="";
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)!=' ' && Pattern.matches("[aeiouAEIOU]",a.charAt(i)+"")){
            ans+=a.charAt(i)+"";
            a=a.replaceAll(a.charAt(i)+""," ");
        }
    }
    a=a.replaceAll(" ","");
    ans=ans+a;
    System.out.println(ans);

    
    }

}
