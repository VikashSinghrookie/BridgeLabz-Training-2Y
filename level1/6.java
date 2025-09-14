package level1;

class vehicle{
 static double registrationfee=5000;
 String ownername;
 String vehicletype;
 final int registrationnumber;

 vehicle(String o,String v,int r){
  this.ownername=o;
  this.vehicletype=v;
  this.registrationnumber=r;
 }

 void show(){
  if(this instanceof vehicle){
   System.out.println("owner:"+ownername+" type:"+vehicletype+" regno:"+registrationnumber+" fee:"+registrationfee);
  }
 }

 static void updateregistrationfee(double f){
  registrationfee=f;
 }

 public static void main(String a[]){
  vehicle v1=new vehicle("rahul","car",111);
  v1.show();
  vehicle.updateregistrationfee(6000);
  v1.show();
 }
}

