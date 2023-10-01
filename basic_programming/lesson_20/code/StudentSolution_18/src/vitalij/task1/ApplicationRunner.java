/*
        * Задача 1: Управление студентами.
    Создайте базовый класс Student (Студент) с атрибутами имя, возраст и средний балл.
    Затем создайте два подкласса: HighSchoolStudent (Старшеклассник) и CollegeStudent (Студент колледжа).

    Добавьте методы в базовый класс для вычисления статуса студента на основе среднего балла.
    Например, если средний балл больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.

    Создайте несколько объектов разных классов студентов и вызовите методы для определения их статуса.*/


package vitalij.task1;

public class ApplicationRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Tom", 18, 6);
        Student student2 = new Student("Ron", 19, 4.7);
        Student student3 = new Student("Jack", 20, 3.5);
        Student student4 = new Student("Lea", 21, 2.5);
        Student student5 = new Student("Sue", 20, 1.5);

        student1.checkStatus();
        student2.checkStatus();
        student3.checkStatus();
        student4.checkStatus();
        student5.checkStatus();
    }
}
