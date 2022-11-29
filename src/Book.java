import java.util.Objects;

public class Book {
    private final String name;
    private final Author authorName;
    private int publishingYear;

    public Book(String name, Author authorName, int publishingYear) {
        this.name = name;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
    public String getName() {
        return name;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        if(publishingYear < 1900 || publishingYear > 2050) {
            System.out.println("Invalid publishing year");
        }
            this.publishingYear = publishingYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && name.equals(book.name) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, publishingYear);
    }

    @Override
    public String toString() {
        return name + authorName + publishingYear;
    }
}
