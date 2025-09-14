class vehicle{
 String ownername;
 String vehicletype;
 static double registrationfee=5000;

 vehicle(String o,String v){
  ownername=o;
  vehicletype=v;
 }

 void displayvehicledetails(){
  System.out.println("owner:"+ownername+" type:"+vehicletype+" fee:"+registrationfee);
 }

 static void updateregistrationfee(double f){
  registrationfee=f;
 }

 public static void main(String a[]){
  vehicle v1=new vehicle("amit","car");
  v1.displayvehicledetails();
  vehicle.updateregistrationfee(6000);
  v1.displayvehicledetails();
 }
}
