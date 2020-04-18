package fischer.eduardo.inversaoDeControle;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InversaoDeControleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationcontext = SpringApplication.run(InversaoDeControleApplication.class, args);
		Pet pet=applicationcontext.getBean(Pet.class);
		pet.execute();
	}

}
