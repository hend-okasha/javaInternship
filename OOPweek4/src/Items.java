import  java.util.ArrayList;
import java.util.List;
public class Items {
    private ArrayList<LibraryResources> items;
        public Items() {
            this.items = new ArrayList<>();
    }

    public void addItem( LibraryResources resources){
        items.add(resources);
    }

    public void deleteItem(LibraryResources resources) {
        if (items.contains(resources)) {
            items.remove(resources);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public ArrayList<LibraryResources> getItems() {
        return items;
    }
}
