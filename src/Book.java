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
}
