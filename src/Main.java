public class Main {
    public static void main(String[] args) {
        Author king = new Author("Стивен", "Кинг");
        Book it = new Book("Оно", king, 1986);

        Author orwell = new Author("Джордж", "Оруэлл");
        Book orw1984 = new Book("1984", orwell, 1949);
        System.out.println(orw1984.getName() + "\n" + orw1984.getAuthorName() + "\n" + orw1984.getPublishingYear() + "\n");

        orw1984.setPublishingYear(1990);

        System.out.println(orw1984.getName() + "\n" + orw1984.getAuthorName() + "\n" + orw1984.getPublishingYear() + "\n");
        System.out.println(it.getName() + "\n" + it.getAuthorName() + "\n" + it.getPublishingYear() + "\n");
    }
}