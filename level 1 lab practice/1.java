class product{
 String productname;
 double price;
 static int totalproducts=0;

 product(String n,double p){
  productname=n;
  price=p;
  totalproducts++;
 }

 void displayproductdetails(){
  System.out.println("name:"+productname+" price:"+price);
 }

 static void displaytotalproducts(){
  System.out.println("total products:"+totalproducts);
 }

 public static void main(String a[]){
  product p1=new product("pen",10);
  product p2=new product("book",50);
  p1.displayproductdetails();
  p2.displayproductdetails();
  product.displaytotalproducts();
 }
}
