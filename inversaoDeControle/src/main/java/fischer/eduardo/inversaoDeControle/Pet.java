package fischer.eduardo.inversaoDeControle;
import fischer.eduardo.inversaoDeControle.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*
    @Author Eduardo Fischer Sutel
    @Since 16/04/2020 16:18
    @Version 1.0
 */
@Component
public class Pet {
    @Autowired
    @Qualifier("cat")
    private IAnimal IAnimal;
    /*
        executa o método comunicar
     */
    public void execute() {
        IAnimal.comunicar();
    }
}
