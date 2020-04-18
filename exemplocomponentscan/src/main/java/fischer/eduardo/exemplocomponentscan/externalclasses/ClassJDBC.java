package fischer.eduardo.exemplocomponentscan.externalclasses;
/*
    @Author Eduardo Fischer Sutel
    @Since  16/04/2020 16:42
    @Version 1.0
  */
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ClassJDBC {
  public ClassJDBC() {
      System.out.println("Conexão JDBC!");
  }

}
