package level1;

class book{
 static String libraryname="city library";
 String title;
 String author;
 final String isbn;

 book(String t,String a,String i){
  this.title=t;
  this.author=a;
  this.isbn=i;
 }

 void show(){
  if(this instanceof book){
   System.out.println("title:"+title+" author:"+author+" isbn:"+isbn+" library:"+libraryname);
  }
 }

 static void displaylibraryname(){
  System.out.println("library:"+libraryname);
 }

 public static void main(String a[]){
  book b1=new book("java","raj","123");
  b1.show();
  book.displaylibraryname();
 }
}
