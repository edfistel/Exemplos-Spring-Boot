package fischer.eduardo.exemploscopo;

import fischer.eduardo.exemploscopo.dao.ClassDAO;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExemploscopoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext= SpringApplication.run(ExemploscopoApplication.class, args);
		ClassDAO objectDAO1 =applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 =applicationContext.getBean(ClassDAO.class);

		System.out.println("Object DAO: "+objectDAO1);
		System.out.println("Object JDBC: "+ objectDAO1.getObjectJDBC());

		System.out.println("Object DAO: "+objectDAO2);
		System.out.println("Object JDBC: "+objectDAO2.getObjectJDBC());
	}

}
