import java.util.ArrayList;
public class Books extends LibraryResources {
    public Books() {
    }
    public Books( String title, String author, int publicationYear) {
        super(title, author, publicationYear);

    }



    @Override
    public void displayInfo() {
        System.out.println("Book:");
        System.out.println("Title:"+ title);
        System.out.println("Author:"+ author);
        System.out.println("publicationYear:"+ publicationYear);
    }

    @Override
    public boolean isAvailable(ArrayList<LibraryResources> items) {
        for (LibraryResources resources : items) {
            if (resources instanceof Books) {
                Books book = (Books) resources;
                if (book.getTitle().equals(this.title)) {
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



