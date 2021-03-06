package eduardo.fischer.teste.gradle.model;
/*
    @Author Eduardo Fischer Sutel
    @Since 15/04/2020 17:38
 */
public class Student {
    private String name;
    private double note1;
    private double note2;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNote1() {
        return note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }
    /*
        @return retorna a media do aluno
     */
    public double calculateAvarage() {
        return (this.note1+this.note2)/2;
    }

    @Override
    public String toString() {
        return "Nome:" + name +
                "Nota1: " + note1 +
                "Nota2: " + note2;
    }
}
