package thisisit;

import java.util.*;

public class BookShelter {
    /*Write a program which can store books in a bookshelf.

    There are two types of books.
            - Hardcover book
  - It should have the following fields: title, author, release year, page
    number and weight.
  - The weight must be calculated from the number of pages (every page weighs
            10 grams) plus the weight of the cover which is 100 grams.
  - It must have a method that returns a string which contains the following
    information about the book: author, title and year.
- Paperback book
  - It should have the following fields: title, author, release year, page
    number and weight.
  - The weight must be calculated from the number of pages (every page weighs
            10 grams) plus the weight of the cover which is 20 grams.
  - It must have a method that returns a string which contains the following
    information about the book: author, title and year.

    You must be able to add books to the bookshelf and must have methods to answer
    the following problems.
- Who is the author of the lightest book?
            - Which author wrote the most pages?*/

    List<Book> bookShelf;

    public BookShelter() {
        bookShelf = new ArrayList<>();
    }

    public void addBook(Book bookType) {
        bookShelf.add(bookType);
    }

    public String lightWeight() {
        String theAuthor = "";
        int smallestBook = 999999999;
        for (Book book : bookShelf) {
            if (book.getWeight() < smallestBook) {
                theAuthor = book.getAuthor();
                smallestBook = book.getWeight();
            }
        }
        return theAuthor;
    }

  public String showAuthorWithMostPages() {
      Map<String, Integer> authors = new HashMap<>();

      for (Book book : bookShelf) {
          String actualAuthor = book.getAuthor();
          int actualPageNumber = book.getPageNumber();

          if (authors.containsKey(actualAuthor)) {
              authors.put(actualAuthor, authors.get(actualAuthor) + actualPageNumber);
          } else {
              authors.put(actualAuthor,actualPageNumber);
          }
      }
     // System.out.println(Collections.max(authors.entrySet(), Map.Entry.comparingByValue()).getKey());
      return Collections.max(authors.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
}
