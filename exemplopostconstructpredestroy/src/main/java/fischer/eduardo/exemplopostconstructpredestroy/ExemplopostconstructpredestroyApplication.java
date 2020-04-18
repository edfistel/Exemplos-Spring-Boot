package fischer.eduardo.exemplopostconstructpredestroy;

import fischer.eduardo.exemplopostconstructpredestroy.dao.ClientDAO;
import fischer.eduardo.exemplopostconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO= applicationContext.getBean(ClientDAO.class);
		clientDAO.setCliente(new Client("Eduardo Fischer"));

		System.out.println("Objeto clienteDAO: "+clientDAO);
		System.out.println("Objeto Cliente: "+clientDAO.getCliente());
	}

}
