public class ProductContolller3 {
    @DeleteMapping("/delete")
    public String deleteProduct() {
        return "Deleted";
    }
}
