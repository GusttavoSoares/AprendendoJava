package Arquivos.Heranca;

public class Professor extends Pessoa {

    private double salary;
    private String departament;
    private String nameCourse;


    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }
    public double calcliquidsalary () {
        return 0;
    }
}