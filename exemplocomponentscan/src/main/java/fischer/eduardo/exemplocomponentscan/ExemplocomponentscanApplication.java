package fischer.eduardo.exemplocomponentscan;

import fischer.eduardo.exemplocomponentscan.externalclasses.ClassDAO;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO1=applicationContext.getBean(ClassDAO.class);
		System.out.println("Objeto DAO: "+objectDAO1);
		System.out.println("Objeto JDBC: "+objectDAO1.getObjectJDBC());
	}

}
