package book_shop;
import behaviours.*;

public class Magazine extends Product implements PageTurnable  {

  int issueNum;
  GenreType genre;

  public Magazine(Double price, String title, GenreType genre, int issueNum) {
    super(price, title);
    this.genre    = genre;
    this.issueNum = issueNum;
  }

  public GenreType getGenre() {
    return genre;
  }

  public int getIssueNum() {
    return issueNum;
  }

  public GenreType genre() {
    return genre;
  }


}