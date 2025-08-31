package java_method_practice.level3;
import java.util.*;

public class calendarapp {
    
    static String getmonthname(int month){
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
    }
    
    static boolean isleap(int year){
        return (year%400==0)||(year%4==0 && year%100!=0);
    }
    
    static int getdaysinmonth(int month,int year){
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isleap(year)) return 29;
        return days[month-1];
    }
    
    // Zeller’s Congruence formula for day of week (0=Sat,1=Sun,...)
    static int getfirstday(int month,int year){
        int q=1; // day of month
        if(month==1){ month=13; year--; }
        if(month==2){ month=14; year--; }
        int k=year%100;
        int j=year/100;
        int h=(q + (13*(month+1))/5 + k + k/4 + j/4 + 5*j)%7;
        // convert to 0=Sun,...6=Sat
        int day=((h+6)%7);
        return day;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter month (1-12): ");
        int month=sc.nextInt();
        System.out.print("enter year: ");
        int year=sc.nextInt();
        
        String mname=getmonthname(month);
        int days=getdaysinmonth(month,year);
        int startday=getfirstday(month,year);
        
        System.out.println("\n   "+mname+" "+year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        
        for(int i=0;i<startday;i++){
            System.out.print("    ");
        }
        
        for(int d=1;d<=days;d++){
            System.out.printf("%4d",d);
            if((d+startday)%7==0) System.out.println();
        }
        System.out.println();
    }
}

