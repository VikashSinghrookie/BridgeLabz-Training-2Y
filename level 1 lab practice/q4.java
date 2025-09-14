class employee{
 public int employeeid;
 protected String department;
 private double salary;

 employee(int i,String d,double s){
  employeeid=i;
  department=d;
  salary=s;
 }

 public void setsalary(double s){
  salary=s;
 }

 public double getsalary(){
  return salary;
 }
}

class manager extends employee{
 manager(int i,String d,double s){
  super(i,d,s);
 }
 void show(){
  System.out.println("id:"+employeeid+" dept:"+department+" salary:"+getsalary());
 }
 public static void main(String a[]){
  manager m1=new manager(201,"cse",50000);
  m1.show();
 }
}
