package independentWork;

import java.util.Objects;

public class Student {
    private int points;
    private String grade;

    public  Student() {

    }

    public Student(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getPoints() == student.getPoints() && Objects.equals(getGrade(), student.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPoints(), getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "points=" + points +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void assessmentDefinition(int points) {
        if (points == 0 || points <= 19) {
            System.out.println( "Оценка F");
        }
     else    if (points > 19 && points <= 39){
            System.out.println("Оценка E");
        }
        else  if (points > 39 && points <= 59){
            System.out.println("Оценка D");
        }
        else  if (points > 59 && points <= 74){
            System.out.println("Оценка C");
        }
        else   if (points > 74 && points <= 89){
            System.out.println("Оценка B");
        }
        else  if (points > 89 && points <=100){
            System.out.println("Оценка A");

        }

        else {
            System.out.println("Это не оценка");
        }
    }


}
