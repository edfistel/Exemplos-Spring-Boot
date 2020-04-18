package eduardo.fischer.teste.gradleLombok.controller;

import eduardo.fischer.teste.gradleLombok.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/*
    @Author Eduardo Fischer Sutel
    @Since 15/04/2020 17:38
    @Version 1.0
 */
@RestController
public class HelloWorldController {
    /*
        retorna a mensagem quando o usuario entra no index
     */
    @GetMapping("/")
    public String index() {
        return "Index";
    }
    /*
        mostra as informações do aluno
     */
    @GetMapping("alunos")
    public Student getStudent() {
        Student student=new Student();
        student.setName("Eduardo");
        student.setNote1(5);
        student.setNote2(2);
        student.calculateAvarage();
        return student;
    }
}
