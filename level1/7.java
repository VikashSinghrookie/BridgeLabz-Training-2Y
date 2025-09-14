package level1;

class patient{
 static String hospitalname="aiims";
 static int total=0;
 String name;
 int age;
 String ailment;
 final int patientid;

 patient(String n,int a,String al,int id){
  this.name=n;
  this.age=a;
  this.ailment=al;
  this.patientid=id;
  total++;
 }

 void show(){
  if(this instanceof patient){
   System.out.println("id:"+patientid+" name:"+name+" age:"+age+" ailment:"+ailment+" hospital:"+hospitalname);
  }
 }

 static void gettotalpatients(){
  System.out.println("total patients:"+total);
 }

 public static void main(String a[]){
  patient p1=new patient("amit",30,"fever",1);
  patient p2=new patient("neha",25,"cough",2);
  p1.show();
  p2.show();
  patient.gettotalpatients();
 }
}

