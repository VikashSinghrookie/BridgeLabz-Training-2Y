class student{
 public int rollnumber;
 protected String name;
 private double cgpa;

 student(int r,String n,double c){
  rollnumber=r;
  name=n;
  cgpa=c;
 }

 public void setcgpa(double c){
  cgpa=c;
 }

 public double getcgpa(){
  return cgpa;
 }
}

class postgraduate extends student{
 postgraduate(int r,String n,double c){
  super(r,n,c);
 }

 void show(){
  System.out.println("roll:"+rollnumber+" name:"+name+" cgpa:"+getcgpa());
 }
 public static void main(String a[]){
  postgraduate s1=new postgraduate(101,"rahul",8.2);
  s1.show();
 }
}
