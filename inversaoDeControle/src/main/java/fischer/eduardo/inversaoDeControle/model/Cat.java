package fischer.eduardo.inversaoDeControle.model;

import fischer.eduardo.inversaoDeControle.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
  /*
       @Author Eduardo Fischer Sutel
       @Since 16/04/2020 16:18
       @Version 1.0

   */
@Component
@Qualifier("Cat")
public class Cat implements IAnimal {
    @Override
    /*
        mostra o meio de comunicação do animal
     */
    public void comunicar() {
        System.out.println("Miau");
    }
}
