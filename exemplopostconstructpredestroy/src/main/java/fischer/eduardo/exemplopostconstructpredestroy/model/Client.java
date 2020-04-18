package fischer.eduardo.exemplopostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/*
    @Author Eduardo Fischer Sutel
    @Since  16/04/2020 16:33
    @Version 1.0
  */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {
    private String name;
    /*
        @Constructor retorna uma mensagem quando o contrutor é executado
     */
    public Client() {
        System.out.println("Classe Cliente!");
    }
}
