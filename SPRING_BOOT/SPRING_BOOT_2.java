@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {

        return new Student(
                1,
                "Shitanshu",
                20);

    }

}