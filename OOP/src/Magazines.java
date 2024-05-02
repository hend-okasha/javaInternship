import java.util.ArrayList;

public class Magazines extends LibraryResources {
    Items item1= new Items();
    public Magazines() {
    }
    public Magazines(String title, String author, int publicationYear) {
        super(title, author, publicationYear);
    }
    @Override
    public void displayInfo() {
        System.out.println("Magazine:");
        System.out.println("Title:"+ title);
        System.out.println("Author:"+ author);
        System.out.println("publicationYear:"+ publicationYear);
    }

    @Override
    public boolean isAvailable(ArrayList<LibraryResources> items) {
        for (LibraryResources resources : items) {
            if (resources instanceof Magazines ) {
                Magazines magazine = (Magazines) resources;
                if (magazine.getTitle().equals(this.title)) {
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
