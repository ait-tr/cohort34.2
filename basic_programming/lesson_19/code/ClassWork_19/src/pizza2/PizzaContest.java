package pizza2;

public class PizzaContest {
    public static void main(String[] args) {
        int totalPizzas = 2;
        int slicesPerPizza = 8;
        int totalSlices = totalPizzas * slicesPerPizza;

        // Создаем участников конкурса
        Participant[] participants = new Participant[3];
        participants[0] = new Participant(1, 1);
        participants[1] = new Participant(2, 2);
        participants[2] = new Participant(3, 1);

        int rounds = 0;
        int lastEatenIndex = -1;

        // Начинаем конкурс
        while (totalSlices > 0) {
            for (int i = 0; i < participants.length; i++) {
                Participant participant = participants[i];
                int name = participant.getName();
                if (totalSlices == 0) {
                    break;
                }
                if (name == 2 && rounds % 2 != 0) {
                    continue;
                }

                if (name == 3 && (totalSlices > 8 && rounds % 2 != 0)) {
                    continue;
                } else if (name == 3 && totalSlices < 9){
                    participant.eatPizza();
                    totalSlices--;
                }

                participant.eatPizza();
                totalSlices--;
                lastEatenIndex = i;
            }
            rounds++;
        }

        // Определяем победителя сортировкой пузырьком
        for (int i = 0; i < participants.length - 1; i++) {
            for (int j = 0; j < participants.length - 1 - i; j++) {
                if (participants[j].getPizzasEaten() > participants[j + 1].getPizzasEaten()) {
                    // Меняем местами участников, чтобы получить сортировку по возрастанию
                    Participant temp = participants[j];
                    participants[j] = participants[j + 1];
                    participants[j + 1] = temp;
                }
            }
        }

        // Выводим результаты
        System.out.println("Победитель: " + participants[2].getName());
        System.out.println("Количество кругов: " + rounds);
        System.out.println("Последний кусок съеден участником: " + participants[lastEatenIndex].getName());
    }
}
