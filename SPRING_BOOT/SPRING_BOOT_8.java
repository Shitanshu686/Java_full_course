@RestController
public class SPRING_BOOT_8 {

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        return "User Id: " + id;
    }
}
