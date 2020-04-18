package fischer.eduardo.exemploscopo.dao;

import net.minidev.json.JSONUtil;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

/*
    @Author Eduardo Fischer Sutel
    @Since  16/04/2020 16:33
    @Version 1.0
  */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassJDBC {
    public ClassJDBC() {
        System.out.println("Classe JDBC!");
    }
}
