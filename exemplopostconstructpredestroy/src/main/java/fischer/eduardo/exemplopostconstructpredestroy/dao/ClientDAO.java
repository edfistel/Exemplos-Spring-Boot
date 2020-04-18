package fischer.eduardo.exemplopostconstructpredestroy.dao;
import fischer.eduardo.exemplopostconstructpredestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
/*
    @Author Eduardo Fischer Sutel
    @Since  16/04/2020 16:33
    @Version 1.0
  */
@Component
@Getter @Setter
public class ClientDAO {
    @Autowired
    private Client cliente;

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("Objeto Criado!");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto Finalizado!");
    }

}
