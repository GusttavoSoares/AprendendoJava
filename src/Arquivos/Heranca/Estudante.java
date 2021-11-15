package Arquivos.Heranca;

public class Estudante extends Pessoa{ // We are making use of inheritance, we are extending the student class to the personal class

    private String course;
    private double[] grades;


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calcaverage () {
        return 0;
    }
    public boolean verifyapproved(){
        return true;
    }

}