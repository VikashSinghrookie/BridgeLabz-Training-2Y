import java.time.*;
import java.util.*;
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        LocalDate d=LocalDate.parse(sc.next());
        d=d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final date: "+d);
    }
}
