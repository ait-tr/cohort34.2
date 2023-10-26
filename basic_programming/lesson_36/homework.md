<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>



</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>


### Задача 1: Использование статического вложенного класса

**Описание**:  
Создайте класс `University`, внутри которого будет статический вложенный класс `Student`. Вложенный класс должен иметь поля `name`, `age` и `grade` (оценка), а также методы для вывода информации о студенте и изменения его оценки.

**Дополнительные условия**:
- Создайте во внешнем классе `University` метод для добавления студентов в массив.
- Создайте метод, который выводит информацию о всех студентах с оценкой выше заданной.

**Цель**:  
Познакомиться с созданием и использованием статических вложенных классов, а также с манипуляцией данными во внешнем классе.

**Пример использования:**
````java

public class University {
    private Student[] students = new Student[10]; // храните студентов в этом массиве
    private int studentCount = 0; // счетчик студентов. При добавлении студента увеличить на 1
    //code...

// напишите статический вложенный клас Student с полями name, age, grade и метод void printInfo() для вывода информации о студенте: "Name: " + name + ", Age: " + age + ", Grade: " + grade

    /**
     * метод для добавления студентов в массив
     * @param student
     */
    public void addStudent(Student student) {
        // code...
    }

    /**
     * метод, который выводит информацию о всех студентах с оценкой выше заданной
     * @param minGrade
     */
    public void printStudentsWithGradeAbove(int minGrade) {
        // code...
    }
    
}




public class Main {

    public static void main(String[] args) {
        University university = new University();
        Student student1 = new Student("Alex", 20, 85);
        Student student2 = new Student("Maria", 21, 90);
        university.addStudent(student1);
        university.addStudent(student2);

        System.out.println("Students with grade above 80:");
        university.printStudentsWithGradeAbove(80);
    }
}

````
---

### Задача 2: Внутренний класс для хранения состояния

**Описание**:  
Создайте класс `BankAccount`, который имеет внутренний класс `Transaction`. Внутренний класс должен хранить информацию о транзакции (сумма, дата, тип транзакции).

**Дополнительные условия**:
- В классе `BankAccount` создайте методы для внесения и снятия денег, которые также создают объекты транзакций.
- Добавьте возможность просмотра истории транзакций.

**Цель**:  
Углубить понимание внутренних классов и их взаимодействия с внешним классом.


**Пример использования:**
````java

public class BankAccount {

    private Transaction[] transactions = new Transaction[10];
    private int transactionCount = 0;

    // создайте внутренний класс Transaction

    public void deposit(double amount) {
        //code...
        transactions[transactionCount++] = new Transaction(amount, "deposit");
        // code..
    }

    public void withdraw(double amount) {
        // code...
        Transaction transaction = new Transaction(amount, "withdraw");
        ArrayTools.add()
        // code...
    }

    public void printTransactionHistory() {
        
    }

}

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(50);

        account.printTransactionHistory();
    }
}
````

---

### Задача 3: Анонимные классы для обработки событий

**Описание**:  
Создайте внутренний интерфейс `OnClickListener` с методами `onClick` и `onDoubleClick`. Создайте класс `Button`, у которого будет метод `setClickListener`, принимающий объект типа `OnClickListener`.

**Дополнительные условия**:
- Реализуйте обработку события "клик" и "двойной клик" с использованием анонимного класса.
- Добавьте возможность отключать слушатель событий.

**Цель**:  
Научиться создавать и использовать анонимные классы для реализации интерфейсов и управления событиями.

---

````java
public class Button {
    private OnClickListener[] listeners = new OnClickListener[10];
    private int listenerCount = 0;

    // создайте внутрений интефейс OnClickListener c двумя методами onClick, onDoubleClick

    public void setClickListener(OnClickListener listener) {
        if (listenerCount < listeners.length) {
            listeners[listenerCount++] = listener;
        }
    }

    public void removeClickListener() {
        listenerCount = 0;
    }

    public void simulateClick() {
        for (int i = 0; i < listenerCount; i++) {
            listeners[i].onClick();
        }
    }

    public void simulateDoubleClick() {
        for (int i = 0; i < listenerCount; i++) {
            listeners[i].onDoubleClick();
        }
    }
}
    

    
    public class Main{
    public static void main(String[] args) {
        Button button = new Button();
        
        button.setClickListener(
                // code here...
        );

        button.simulateClick();
        button.simulateDoubleClick();
        button.removeClickListener();
    }
}

````

</details>
