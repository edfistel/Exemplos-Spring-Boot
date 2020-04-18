package fischer.eduardo.exemplocomponentscan.externalclasses;
/*
    @Author Eduardo Fischer Sutel
    @Since  16/04/2020 16:40
    @Version 1.0
  */
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class ClassDAO {
    @Autowired
    ClassJDBC objectJDBC;
}
