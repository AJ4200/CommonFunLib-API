@RestController

public class apiController {
    int length;
    @GetMapping("/Generator/generatePassword/"+length)
    public String hello() {
        return "Hello World!";
    }
}
