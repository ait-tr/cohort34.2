/**
 * Главный класс для выполнения операций с банком и банкоматом.
 */
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(50);

        BankCard bankCard1 = new BankCard("Andre", "Reutow");
        BankCard bankCard2 = new BankCard("Andre", "Reutow");
        BankCard bankCard3 = new BankCard("John", "Doe");

        bank.addCard(bankCard1);
        bank.addCard(bankCard2);
        bank.addCard(bankCard3);

        // todo реализовать конструктов в классе ATM который будет принимать объект Bank
        // ATM atm = new ATM(bank);

        //  atm.withdraw(bankCard, 100);
        //  atm.deposit(bankCard, 100);
        //  atm.showBalance(bankCard);
    }
}

