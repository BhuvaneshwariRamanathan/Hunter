 import java.util.Scanner;
public class RemoveDup {

    public static void main(String[] args) {
       
       
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String ans="";
    for(int i=0;i<a.length();i++){
        if(a.indexOf(a.charAt(i))==a.lastIndexOf(a.charAt(i))){
            ans+=a.charAt(i)+"";
        }
        else{
            continue;
        }
    }
System.out.println(ans);
    }

}
