import java.time.*;
import java.util.*;
public class P4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate d1=LocalDate.parse(sc.next());
        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate d2=LocalDate.parse(sc.next());
        if(d1.isBefore(d2))
            System.out.println("First date is before second");
        else if(d1.isAfter(d2))
            System.out.println("First date is after second");
        else if(d1.isEqual(d2))
            System.out.println("Both dates are same");
    }
}
