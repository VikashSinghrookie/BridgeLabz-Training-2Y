package Array_practice.level1;

import java.util.Scanner;
public class voting_criteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages=new int[10];
        System.out.println("ages of 10 students:");
        for (int i=0;i<ages.length;i++) {
            ages[i]=sc.nextInt();
        }
        System.out.println("\nVoting results:");
        for (int age:ages) {
            if (age<0) {
                System.out.println("are you serious bro");
            } else if(age>=18) {
                System.out.println("your age is "+age+" you can vote");
            } else{
                System.out.println("your age is "+age+" you cannot vote");
            }
        }
    }
}

