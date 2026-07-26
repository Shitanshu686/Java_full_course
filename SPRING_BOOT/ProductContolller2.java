@RestController
public class ProductContolller2 {

    @PutMapping("/update")
    public String updateProduct() {
        return "Updated";
    }

}