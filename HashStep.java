import java.util.Scanner;
public class HashStep{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number");
int a=s.nextInt();
    if(a<0){
        System.out.println("The number must be positive");
    }
    else{
    for(int i=0;i<a;i++){
        for(int j=0;j<=i;j++){
            System.out.print("#");
        }
        System.out.println();
    }
    }
  
    
    }

}
