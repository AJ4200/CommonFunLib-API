@RestController

public class apiController {

    Generator generator = new Generator();
    int length;
    @GetMapping("/Generator/generatePassword/"+length)
    public String generatePassword() {
        return generator.generatePassword(length);
    }
}
