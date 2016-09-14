package book_shop;
import behaviours.*;

public class Newspaper extends Product implements PageTurnable {

  GenreType genre;
  String date;

  public Newspaper(Double price, String title, GenreType genre, String date){
    super(price, title);
    this.genre  = genre;
    this.date   = date;  
  }

  public GenreType getGenre() {
    return genre;
  }

  public String getDate() {
    return date;
  }






}