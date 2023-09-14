/* Задача 6*: Калькулятор криптовалюты для Васи (CryptoCalculator)

Описание:
У Васи есть 12350 монет криптовалюты. Все монеты он купил по цене 0.27 евро. Сегодня монета стоит 16.38 евро.

Вопросы:
На какую сумму Вася может рассчитывать, если продаст все свои монеты?
Имя метода: calculateTotalValue
Какая прибыль будет у Васи, если он продаст монеты сейчас?
Имя метода: calculateProfit
Сколько монет нужно продать, чтобы получить x прибыль?
Имя метода: coinsForXProfit
Какая стоимость монеты должна быть, чтобы получить x прибыль?
Имя метода: priceForXProfit
Сколько монет нужно по текущему курсу, чтобы получить x сумму?
Имя метода: coinsForXAmount

Cо звёздочкой *:
Всё то же самое, только любой доход облагается налогом. Налог 23%.
Метод: applyTax

Ожидаемый вывод:
Программа должна быть готова к тому, что все значения могут меняться, и расчёт должен быть произведён в любом случае.

Подсказки:
double calculateTotalValue(double initialCoins, double currentPrice)
double calculateProfit(double initialCoins, double initialPrice, double currentPrice)
double coinsForXProfit(double initialCoins, double initialPrice, double currentPrice, double desiredProfit)
double priceForXProfit(double initialCoins, double initialPrice, double desiredProfit)
double coinsForXAmount(double currentPrice, double desiredAmount)
double applyTax(double income) */

public class CryptoCalculator {
    public static void main(String[] args) {

        System.out.println("Вася может расчитывать на сумму " +
                calculateTotalValue(12350, 16.38) +
                " евро, если продаст все свои монеты. После вычета налога эта сумма составит " +
                (calculateTotalValue(12350, 16.38) - calculateTotalValue(12350, 16.38) * applyTax(0.23)) +
                " евро.");

        System.out.println("Если Вася продаст свои монеты сейчас, его прибыль составит " +
                calculateProfit(12350, 0.27, 16.38) +
                " евро. После вычета налога эта сумма составит " +
                (calculateProfit(12350, 0.27, 16.38) - calculateProfit(12350, 0.27, 16.38) * applyTax(0.23)) +
                " евро.");

        System.out.println("Чтобы получить прибыль в размере 1000000 евро, Васе необходимо продать " +
                coinsForXProfit(0.27, 16.38, 1000000) / applyTax(0.77) +
                " монет (также с учетом налогового обложения).");

        System.out.println("Чтобы получить прибыль в размере 1000000 евро от продажи 12350 монет, стоимость монеты должна составлять " +
                priceForXProfit(12350, 1000000) / applyTax(0.77) +
                " евро (также с учетом налогового обложения).");

        System.out.println("Чтобы получить сумму в размере 1000000 евро по текущему курсу, необходимо иметь " +
                coinsForXAmount(16.38, 1000000) / applyTax(0.77) +
                " монет (также с учетом налогового обложения).");
    }

    public static double calculateTotalValue(double initialCoins, double currentPrice) {
        return initialCoins * currentPrice;
    }

    public static double calculateProfit(double initialCoins, double initialPrice, double currentPrice) {
        return (initialCoins * currentPrice) - (initialCoins * initialPrice);
    }

    public static double coinsForXProfit(double initialPrice, double currentPrice, double desiredProfit) {
        return desiredProfit / (currentPrice - initialPrice);
    }

    public static double priceForXProfit(double initialCoins, double desiredProfit) {
        return desiredProfit / initialCoins;

    }

    public static double coinsForXAmount(double currentPrice, double desiredAmount) {
        return desiredAmount / currentPrice;
    }

    public static double applyTax(double income) {
        return income;
    }
}

        
/* Это был сущий ад!!! Именно математика, не код. Но задание крутое, спасибо xD
У меня такой вопрос:
 В задании были подсказки с названиями методов и их параметров

double coinsForXProfit(!!!double initialCoins!!!, double initialPrice, double currentPrice, double desiredProfit)

double priceForXProfit(double initialCoins, !!!double initialPrice!!!, double desiredProfit)

Вот в этих двух методах 2 параметра мне не пригодились. Выделил !!!. Такое возможно?
Но вроде все проверил, перерешал на калькуляторе, все сошлось. И не стал делать без учета налога, решил сразу вот так.
*/
