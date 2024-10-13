public class Book {
    private String title;
    private String authorFullName;
    private int publicationYear;
    private String publisherName;
    private String genre;
    private int pageCount;

    // Конструкторы
    public Book(String title, String authorFullName, int publicationYear, String publisherName, String genre, int pageCount) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.publicationYear = publicationYear;
        this.publisherName = publisherName;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    // Перегруженный конструктор
    public Book(String title, String authorFullName) {
        this(title, authorFullName, 0, null, null, 0);
    }

    // Геттеры и сеттеры
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthorFullName() { return authorFullName; }
    public void setAuthorFullName(String authorFullName) { this.authorFullName = authorFullName; }

    public int getPublicationYear() { return publicationYear; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

    public String getPublisherName() { return publisherName; }
    public void setPublisherName(String publisherName) { this.publisherName = publisherName; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    // Метод для ввода данных
    public void inputData(String title, String authorFullName, int publicationYear, String publisherName, String genre, int pageCount) {
        this.title = title;
        this.authorFullName = authorFullName;
        this.publicationYear = publicationYear;
        this.publisherName = publisherName;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    // Метод для вывода данных
    public void printData() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + authorFullName);
        System.out.println("Год издания: " + publicationYear);
        System.out.println("Издательство: " + publisherName);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + pageCount);
    }

    // Перегруженный метод для краткого вывода
    public void printData(boolean brief) {
        if (brief) {
            System.out.println(title + " от " + authorFullName);
        } else {
            printData();
        }
    }
}
