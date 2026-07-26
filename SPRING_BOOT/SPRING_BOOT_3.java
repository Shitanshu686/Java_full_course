//Returing a List

import java.util.ArrayList;
import java.util.List;

@RestController
public class SPRING_BOOT_3 {
    @GetMapping("/products")
    public List<String> getProducts() {
        List<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Phone");
        products.add("Watch");

        return products;
    }
}