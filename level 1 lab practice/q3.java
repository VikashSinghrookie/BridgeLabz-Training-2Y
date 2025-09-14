class bankaccount{
 public int accountnumber;
 protected String accountholder;
 private double balance;

 bankaccount(int n,String h,double b){
  accountnumber=n;
  accountholder=h;
  balance=b;
 }

 public void setbalance(double b){
  balance=b;
 }

 public double getbalance(){
  return balance;
 }
}

class savingsaccount extends bankaccount{
 savingsaccount(int n,String h,double b){
  super(n,h,b);
 }
 void show(){
  System.out.println("acc no:"+accountnumber+" holder:"+accountholder+" balance:"+getbalance());
 }
 public static void main(String a[]){
  savingsaccount s1=new savingsaccount(1001,"vikas",2000);
  s1.show();
 }
}
