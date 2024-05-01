import java.util.ArrayList;
abstract class LibraryResources {
    protected String title;
    protected String author;
    protected int  publicationYear;

    public LibraryResources() {
    }

    public LibraryResources(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    abstract public void displayInfo();
    abstract public boolean isAvailable(ArrayList<LibraryResources> items);
    abstract public void update(String newTitle, String newAuthor, int newPublicationYear);
}
