package slide_examples.e_object_class.entities;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
        this.author = "UNKNOWN";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{title=" + title + ", author=" + author + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) {
            return false;
        }

        if(!title.equals(book.title)){
            return false;
        }
        if(!author.equals(book.author)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
