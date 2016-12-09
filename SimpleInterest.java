import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the principle,number of year,rate of interest");
float p=s.nextFloat();
int n=s.nextInt();
float r=s.nextFloat();
float simple=(p*n*r)/100f;
System.out.println(simple);
}
}
