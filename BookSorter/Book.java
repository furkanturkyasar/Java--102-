public class Book {
    private final String bookName;
    private final int pageNumber;
    private String author;
    private int publishDate;

    Book(String bookName, int pageNumber, String author, int publishDate) {
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

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
}
