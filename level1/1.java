package level1;

class bankaccount{
 static String bankname="sbi";
 static int total=0;
 final int accountnumber;
 String accountholder;

 bankaccount(String h,int n){
  this.accountholder=h;
  this.accountnumber=n;
  total++;
 }

 void show(){
  if(this instanceof bankaccount){
   System.out.println("holder:"+accountholder+" accno:"+accountnumber+" bank:"+bankname);
  }
 }

 static void gettotalaccounts(){
  System.out.println("total accounts:"+total);
 }

 public static void main(String a[]){
  bankaccount b1=new bankaccount("amit",101);
  bankaccount b2=new bankaccount("rahul",102);
  b1.show();
  b2.show();
  bankaccount.gettotalaccounts();
 }
}

