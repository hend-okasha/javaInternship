import java.util.ArrayList;

public class DVDs extends LibraryResources {
    Items item1= new Items();
    public DVDs() {
    }
    public DVDs(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }
    @Override
    public void displayInfo() {
        System.out.println("DVD:");
        System.out.println("Title:"+ title);
        System.out.println("Author:"+ author);
        System.out.println("publicationYear:"+ publicationYear);
    }

    @Override
    public boolean isAvailable(ArrayList<LibraryResources> items) {
        for (LibraryResources resources : items) {
            if (resources instanceof DVDs) {
                DVDs dvd = (DVDs) resources;
                if (dvd.getTitle().equals(this.title)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void update(String newTitle, String newAuthor, int newPublicationYear) {
        this.title = newTitle;
        this.author = newAuthor;
        this.publicationYear = newPublicationYear;
    }
}
