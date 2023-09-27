package task1;

/**
 * @author Andrej Reutow
 * created on 26.09.2023
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Farkhunda", 31, "odinaevafarkhunda@gmail.com");
        System.out.println("Farkhunda" + user.getName());
        System.out.println("31" + user.getAge());
        System.out.println("email" + user.getEmail());

        System.out.println();
        user.setName("Odinaeva");
        user.setAge(32);
        user.setEmail("farkhundaodinaeva@gmail.com");
    }
}
