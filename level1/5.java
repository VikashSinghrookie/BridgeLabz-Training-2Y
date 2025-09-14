package level1;

class student{
 static String universityname="gla";
 static int total=0;
 String name;
 final int rollnumber;
 String grade;

 student(String n,int r,String g){
  this.name=n;
  this.rollnumber=r;
  this.grade=g;
  total++;
 }

 void show(){
  if(this instanceof student){
   System.out.println("name:"+name+" roll:"+rollnumber+" grade:"+grade+" univ:"+universityname);
  }
 }

 static void displaytotalstudents(){
  System.out.println("total students:"+total);
 }

 public static void main(String a[]){
  student s1=new student("kiran",101,"a");
  student s2=new student("neha",102,"b");
  s1.show();
  s2.show();
  student.displaytotalstudents();
 }
}

