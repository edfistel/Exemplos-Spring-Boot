package eduardo.fischer.teste.gradleLombok;

import eduardo.fischer.teste.gradleLombok.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Student student =new Student();

		student.setName("Eduardo");
		student.setNote1(5);
		student.setNote2(2);

		System.out.println(student);
		System.out.println("Média: "+student.calculateAvarage());
	}

}
