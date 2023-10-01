package test;

// Создайте базовый класс Student (Студент) с атрибутами имя, возраст и средний балл. Затем создайте два подкласса:
// HighSchoolStudent (Старшеклассник) и CollegeStudent (Студент колледжа).
//Добавьте методы в базовый класс для вычисления статуса студента на основе среднего балла. Например, если средний балл
// больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.
//Создайте несколько объектов разных классов студентов и вызовите методы для определения их статуса.
public class Main {
    public static void main(String[] args) {
        Student collegeStudent = new CollegeStudent("Ivan", 6, 4);
        Student collegeStudent2 = new CollegeStudent("Nina", 7, 3);
        Student highScoolStudent = new HighSchoolStudent("Vasiliy", 12, 10);
        Student highScoolStudent1 = new HighSchoolStudent("Maria", 14, 4);

        Student[] students = {collegeStudent, collegeStudent2, highScoolStudent1, highScoolStudent};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " "+ students [i].getStatus());
        }
    }
}
