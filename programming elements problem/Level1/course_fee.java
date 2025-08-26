public class course_fee {
    public static void main(String[] args) {
        int fee = 125000;
        int dp = 10;
        double d = (fee*dp/100.0);
        double finalFee = fee-d;
        System.out.println("The discount amount is INR "+d+" and final discounted fee is INR "+ finalFee);
    }
}
