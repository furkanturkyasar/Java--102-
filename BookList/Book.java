public class Book {
    private final String bookName;
    private final int pageNumber;
    private final String author;
    private final int publishDate;


    public Book(String bookName, int pageNumber, String author, int publishDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthor() {
        return author;
    }

}
