class book{
 public String isbn;
 protected String title;
 private String author;

 book(String i,String t,String a){
  isbn=i;
  title=t;
  author=a;
 }

 public void setauthor(String a){
  author=a;
 }

 public String getauthor(){
  return author;
 }
}

class ebook extends book{
 ebook(String i,String t,String a){
  super(i,t,a);
 }
 void show(){
  System.out.println("isbn:"+isbn+" title:"+title+" author:"+getauthor());
 }
 public static void main(String a[]){
  ebook b1=new ebook("123","java book","raj");
  b1.show();
 }
}
