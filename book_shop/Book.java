package book_shop;
import behaviours.*;

public class Book extends Product implements PageTurnable {

  String author;
  GenreType genre;

  public Book(Double price, String title, String author, GenreType genre){
    super(price, title);
    this.author = author;
    this.genre = genre;
  }

  public GenreType getGenre() {
    return genre;
  }

  
}
