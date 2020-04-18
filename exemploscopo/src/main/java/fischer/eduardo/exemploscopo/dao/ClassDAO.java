package fischer.eduardo.exemploscopo.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
    @Author Eduardo Fischer Sutel
    @Since  16/04/2020 16:33
    @Version 1.0
  */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Getter @Setter
public class ClassDAO {
    @Autowired
    ClassJDBC objectJDBC;
}
