package eduardo.fischer.teste.gradle;

import eduardo.fischer.teste.gradle.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Student student =new Student();
		student.setName("Eduardo");
		student.setNote1(10);
		student.setNote2(10);

		System.out.println(student);
		System.out.println("Média: "+student.calculateAvarage());
	}

}
