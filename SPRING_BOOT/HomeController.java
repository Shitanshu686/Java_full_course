@RestController
public class HomeController {
    @Autowired
    SPRING_BOOT_4 service;

    @GetMapping("/")
    public String home() {
        return service.getMessage();

    }
}