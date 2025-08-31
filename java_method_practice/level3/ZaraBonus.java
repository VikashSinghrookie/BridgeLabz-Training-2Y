package java_method_practice.level3;
import java.util.Random;

public class ZaraBonus {

    static int[][] getSalaryAndService(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int service = 1 + rand.nextInt(10);       
            data[i][0] = salary;
            data[i][1] = service;
        }
        return data;
    }

    static double[][] getNewSalaryAndBonus(int[][] oldData) {
        int n = oldData.length;
        double[][] newData = new double[n][2];
        for (int i = 0; i < n; i++) {
            int salary = oldData[i][0];
            int service = oldData[i][1];
            double bonusRate = (service > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    static void displayReport(int[][] oldData, double[][] newData) {
        double sumOld = 0, sumNew = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-12s %-12s %-12s\n", 
                          "EmpID", "OldSalary", "Service", "Bonus", "NewSalary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int service = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            sumOld += oldSalary;
            sumNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12d %-12d %-12.2f %-12.2f\n", 
                               (i+1), oldSalary, service, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f\n", 
                          "TOTAL", sumOld, "", totalBonus, sumNew);
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] oldData = getSalaryAndService(n);
        double[][] newData = getNewSalaryAndBonus(oldData);
        displayReport(oldData, newData);
    }
}
