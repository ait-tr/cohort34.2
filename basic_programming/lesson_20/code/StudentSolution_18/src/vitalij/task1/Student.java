package vitalij.task1;

public class Student {
    private String name;
    private int age;
    private double averageScore;

    public Student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void checkStatus() {

        if (this.averageScore >= 4.5 && this.averageScore <= 5) {
            System.out.println("Студент - \"отличник\".");
        } else if (this.averageScore >= 3.0 && this.averageScore < 4.5) {
            System.out.println("Студент - \"хорошист\".");
        } else if (this.averageScore > 2.0 && this.averageScore < 3) {
            System.out.println("Студент - \"троечник\".");
        } else {
            System.out.println("Учился ли студент вообще... ?");
        }
    }
}
