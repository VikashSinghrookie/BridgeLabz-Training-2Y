package level1;
class employee{
 static String companyname="infosys";
 static int total=0;
 String name;
 final int id;
 String designation;

 employee(String n,int i,String d){
  this.name=n;
  this.id=i;
  this.designation=d;
  total++;
 }

 void show(){
  if(this instanceof employee){
   System.out.println("name:"+name+" id:"+id+" desig:"+designation+" company:"+companyname);
  }
 }

 static void displaytotalemployees(){
  System.out.println("total employees:"+total);
 }

 public static void main(String a[]){
  employee e1=new employee("vikas",1,"developer");
  employee e2=new employee("amit",2,"tester");
  e1.show();
  e2.show();
  employee.displaytotalemployees();
 }
}

