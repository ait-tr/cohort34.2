```java
public class CryptoCalculator {

    public static double calculateTotalValue(double coinCount, double currentPrice) {
        return coinCount * currentPrice;
    }

    public static double calculateProfit(double coinCount, double currentPrice, double purchasePrice) {
        return calculateTotalValue(coinCount, currentPrice) - (coinCount * purchasePrice);
    }

    public static void main(String[] args) {
        double coinCount = 12350;
        double purchasePrice = 0.27;
        double currentPrice = 16.38;

        double totalValue = calculateTotalValue(coinCount, currentPrice);
        double profit = calculateProfit(coinCount, currentPrice, purchasePrice);

        System.out.println("Total Value: " + totalValue);
        System.out.println("Profit: " + profit);
    }
}

```

```java
public class EnergyCalculator {

    public static double calculateHourlyConsumption(double fridge, double ac) {
        return fridge + ac;
    }

    public static double calculateMonthlyCost(double hourlyConsumption, double costPerKWh) {
        return (hourlyConsumption / 1000) * 24 * 30 * costPerKWh;
    }

    public static void main(String[] args) {
        double fridge = 150;
        double ac = 2000;
        double costPerKWh = 0.15;

        double hourlyConsumption = calculateHourlyConsumption(fridge, ac);
        double monthlyCost = calculateMonthlyCost(hourlyConsumption, costPerKWh);

        System.out.println("Hourly Consumption: " + hourlyConsumption + " W");
        System.out.println("Monthly Cost: " + monthlyCost + " EUR");
    }
}

```
