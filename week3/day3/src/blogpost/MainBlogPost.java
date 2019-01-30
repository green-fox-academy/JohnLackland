package blogpost;

public class MainBlogPost {
    public static void main(String[] args) {
        BlogPost firstAuthor = new BlogPost();
        firstAuthor.authorName = "John Doe";
        firstAuthor.publicationDate = "2000.05.04.";
        firstAuthor.title = "Lorem Ipsum";
        firstAuthor.text = "Lorem ipsum dolor sit amet.";

        BlogPost secondAuthor = new BlogPost();
        secondAuthor.authorName = "Tim Urban";
        secondAuthor.publicationDate = "2010.10.10.";
        secondAuthor.title = "Wait but why";
        secondAuthor.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost thirdAuthor = new BlogPost();
        thirdAuthor.authorName = "William Turton";
        thirdAuthor.publicationDate = "2017.03.28.";
        thirdAuthor.title = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        thirdAuthor.text = "Lorem ipsum dolor sit amet.";
    }
}
