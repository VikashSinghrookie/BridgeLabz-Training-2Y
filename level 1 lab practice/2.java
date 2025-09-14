class course{
 String coursename;
 int duration;
 double fee;
 static String institutename="gla university";

 course(String n,int d,double f){
  coursename=n;
  duration=d;
  fee=f;
 }

 void displaycoursedetails(){
  System.out.println("course:"+coursename+" duration:"+duration+" fee:"+fee+" institute:"+institutename);
 }

 static void updateinstitutename(String newname){
  institutename=newname;
 }

 public static void main(String a[]){
  course c1=new course("java",3,5000);
  c1.displaycoursedetails();
  course.updateinstitutename("iit delhi");
  c1.displaycoursedetails();
 }
}
