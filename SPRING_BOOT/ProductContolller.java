@RestController
public class ProductContolller {
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product product) {
        return product;
    }

}