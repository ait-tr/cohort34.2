package pizza2;

public class Participant {
    private int name;
    private int speed;
    private int pizzasEaten;

    public Participant(int name, int speed) {
        this.name = name;
        this.speed = speed;
        this.pizzasEaten = 0;
    }

    public int getName() {
        return name;
    }

    public int getPizzasEaten() {
        return pizzasEaten;
    }

    public void eatPizza() {
        pizzasEaten++;
    }
}
