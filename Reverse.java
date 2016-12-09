import java.util.Scanner;
public class Reverse{
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
   String a=s.nextLine();
    String str[]=a.split(" ");
    String ans="";
    for(int i=str.length-1;i>=0;i--){
        ans+=str[i]+" ";
    }
    ans.trim();
   System.out.println(ans);
    }

}
