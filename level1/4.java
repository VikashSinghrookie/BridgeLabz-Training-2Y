package level1;

class product{
 static double discount=10;
 String productname;
 double price;
 int quantity;
 final int productid;

 product(String n,double p,int q,int id){
  this.productname=n;
  this.price=p;
  this.quantity=q;
  this.productid=id;
 }

 void show(){
  if(this instanceof product){
   System.out.println("id:"+productid+" name:"+productname+" price:"+price+" qty:"+quantity+" discount:"+discount+"%");
  }
 }

 static void updatediscount(double d){
  discount=d;
 }

 public static void main(String a[]){
  product p1=new product("pen",10,5,101);
  p1.show();
  product.updatediscount(20);
  p1.show();
 }
}

