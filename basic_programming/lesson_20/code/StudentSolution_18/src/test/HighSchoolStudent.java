package test;

public class HighSchoolStudent extends Student{
    public HighSchoolStudent(String name, int age, double averageScore) {
        super(name, age, averageScore);
    }

    public String getStatus() {
        if (averageScore >= 7 ) {
            return "Pass";
        } else {
            return "Not pass";
        }
    }
    @Override
    public void setAverageScore(double averageScore) {
        if (averageScore > 12){
            System.out.println("Error");
            return;
        }
        super.setAverageScore(averageScore);
    }
}
