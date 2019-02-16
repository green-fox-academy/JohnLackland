package thisisit;

public class Main {
    public static void main(String[] args) {
        BookShelter bookShelf = new BookShelter();
        bookShelf.addBook(new PaperCoverBook("gsgsg","Smith",424,60));
        bookShelf.addBook(new PaperCoverBook("grewrwsgsg","Smith",4234,0));
        bookShelf.addBook(new HardCoverBook("fsfdwerwrsfsfs","Igor",323,35));
        bookShelf.addBook(new HardCoverBook("fsfdrwersfsfs","Darwin",323,46));
        bookShelf.addBook(new HardCoverBook("fsfdsfsrwerfs","Jason",323,61));
        System.out.println(bookShelf.lightWeight());
        System.out.println(bookShelf.showAuthorWithMostPages());

        for (Book book: bookShelf.bookShelf) {
            System.out.println(book.giveInformation());
        }
    }
}
