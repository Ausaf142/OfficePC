package Java_Practice;

import java.util.ArrayList;

public class Book {
static String title;
static String author;
static String isbn;
public static ArrayList < Book > bookCollection = new ArrayList < Book > ();
 
public Book(String title,String author,String isbn) {
	this.title=title;
	this.author=author;
	this.isbn=isbn;
}

public static void addbook(Book book) {
	bookCollection.add(book);
}
public static void removebook(Book book) {
	bookCollection.remove(book);
}
public static  ArrayList < Book > library() {
    return bookCollection;
  }

public static void main(String[] args) {
	Book b1 =new Book("adeeb", "man", "BB1");
//	Book b2 =new Book("Ausaf", "ff", "BB2");
//	Book b3 =new Book("babloo", "mddan", "BB3");
//	Book b4 =new Book("adeeb", "man", "BB4");
	
//	Book.addbook(b1);
//	Book.addbook(b2);
	Book.addbook(b1);
//	Book.removebook(b3);
	 ArrayList < Book > bookCollection = Book.library();
	
	   for (Book element : bookCollection) {
		   System.out.println(Book.title + " by " + Book.author + ", ISBN: " +Book.isbn);
       }
	
}

}
