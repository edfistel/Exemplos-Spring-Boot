package eduardo.fischer.teste.gradleLombok.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
    @Author Eduardo Fischer Sutel
    @Since 15/04/2020 17:38
 */
@Getter @Setter
@NoArgsConstructor
@ToString
public class Student {
    private String name;
    private double note1;
    private double note2;

    /*
        @return retorna a media do aluno
     */
    public double calculateAvarage(){
        return (this.note1+this.note2)/2;
    }
}
