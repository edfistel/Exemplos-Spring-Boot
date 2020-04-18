package fischer.eduardo.gradlerestrepositores.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
    @Author Eduardo Fischer Sutel
    @Since 18/04/2020 12:12
    @Version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo Rest Repositores";
    }
}
