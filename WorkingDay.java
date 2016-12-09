import java.util.Scanner;
public class WorkingDay{
public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
   System.out.println("Enter the day");
    String day=s.nextLine();
    if(day.equalsIgnoreCase("sat")||day.equalsIgnoreCase("sun")){
        System.out.println("False");
    }
    else{
        System.out.println("True");
    }
    }

}
