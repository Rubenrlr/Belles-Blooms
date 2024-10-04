import java.util.List;
import java.util.ArrayList;
import flowers.Flower;

public class CatalogManager {
    // either ArrayList or HashMap could be used for flower data
    // list to store the flowers
    private List<Flower> flowerCatalog;

    public CatalogManager() {
        flowerCatalog = new ArrayList<>();
        
        // flower data goes here    ("Rose", "red", "love", 5.99)
        flowerCatalog.add(new Flower(null, null, null, 0));
    
    }

    // retreive all flowers in catalog
    public List<Flower> getCatalog() {
        return flowerCatalog;
    }

    // method to filter flowers 

}