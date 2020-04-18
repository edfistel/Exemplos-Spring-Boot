package eduardo.fischer.teste.gradle.controller;

import eduardo.fischer.teste.gradle.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String index() {
        return "Index";
    }

    @GetMapping("/alunos")
    public Student getStudent() {
        Student student=new Student();
        student.setName("Eduardo");
        student.setNote1(10);
        student.setNote2(10);
        student.calculateAvarage();
        return student;
    }
}
