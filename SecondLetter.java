import java.util.Scanner;
public class SecondLetter{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the String");
String a=s.nextLine();
System.out.println(a.charAt(0)+""+Character.toUpperCase(a.charAt(1))+a.substring(2));
    }

}
