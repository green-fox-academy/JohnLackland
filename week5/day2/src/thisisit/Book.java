package thisisit;

public class Book {
   private String title;
   private String author;
   private int releaseDate;
   private int pageNumber;
   protected int weight ;
   int coverWeight;

    public Book(String title, String author, int year, int pages, int coverWeight) {
        this.title = title;
        this.author = author;
        this.releaseDate = year;
        this.pageNumber = pages;
        this.coverWeight = coverWeight;
        this.weight = pageNumber * 10 + coverWeight;
    }

   public String giveInformation(){
       return "Information about the book: " + author + ", " + title + " and " + releaseDate + ".";
   }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getWeight() {
        return weight;
    }
}
