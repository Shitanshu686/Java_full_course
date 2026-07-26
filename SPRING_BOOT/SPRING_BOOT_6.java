@RestController
public class SPRING_BOOT_6 {
    @PostMapping("/save")
    public String saveUser() {
        return "User Saved";
    }
}
