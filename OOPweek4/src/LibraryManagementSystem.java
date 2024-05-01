
public class LibraryManagementSystem {

    public static void main(String[] args) {
        Items item = new Items();
        Books book1 = new Books("book1", "author1", 2010);
        Magazines magazine = new Magazines("magazine", "author2", 2012);
        DVDs dvd = new DVDs("DVD", "author3", 2013);
        Books book2 = new Books("book2","author4", 2001);
        item.addItem(book1);
        item.addItem(magazine);
        item.addItem(dvd);
        item.deleteItem(book2);
        book1.update("newTitle","newAuthor",2003);
        book1.displayInfo();

    }

    }
