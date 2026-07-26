@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "Hello Spring Boot";

		// Multiple APIs
		public class DemoContoller {
			@GetMapping("/")
			public String home() {
				return "Home";
			}

			@GetMapping("/about")
			public String about() {
				return "About";
			}

			@GetMapping("/contact")
			public String contact() {
				return "Contact";
			}
		}
	}
}
