package Array_practice.level2;

import java.util.Scanner;
public class q_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;

        double []salary=new double[n];
        double []service=new double[n];
        double []bonus=new double[n];
        double []newSalary=new double[n];

        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;

        for(int i=0;i<n;i++){
            System.out.println("enter salary "+(i+1));
            double s=sc.nextDouble();
            System.out.println("enter years of service for employee "+(i+1));
            double y=sc.nextDouble();

            if(s<=0 || y<0){
                System.out.println("are you sure do it again");
                i--;
                continue;
            }
            salary[i]=s;
            service[i]=y;
        }

        for(int i=0;i<n;i++){
            if(service[i]>5){
                bonus[i]=salary[i]*0.05;
            } else {
                bonus[i]=salary[i]*0.02;
            }
            newSalary[i]=salary[i]+bonus[i];
            totalBonus+=bonus[i];
            totalOldSalary+=salary[i];
            totalNewSalary+=newSalary[i];
        }

        for(int i=0;i<n;i++){
            System.out.println("employee "+(i+1));
            System.out.println("Old Salary: "+salary[i]);
            System.out.println("bonus: "+bonus[i]);
            System.out.println("New Salary: "+newSalary[i]);
            System.out.println("-----------------------");
        }

        System.out.println("Total Old Salary of all employees: "+totalOldSalary);
        System.out.println("Total Bonus payout: "+totalBonus);
        System.out.println("Total New Salary of all employees: "+totalNewSalary);
    }
}

