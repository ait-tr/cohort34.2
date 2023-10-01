package test;// больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.

public class CollegeStudent extends Student {
    public CollegeStudent(String name, int age, double averageScore) {
        super(name, age, averageScore);
    }

    @Override
    public String getStatus() {
        if (averageScore >= 4.5) {
            return "Honours student";
        } else if (averageScore >= 3.5) {
            return "Good student";
        } else {
            return "Poor student";
        }
    }

    @Override
    public void setAverageScore(double averageScore) {
        if (averageScore > 5) {
            System.out.println("Error");
            return;
        }

        super.setAverageScore(averageScore);
    }
}
