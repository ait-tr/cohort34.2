/**
 * @author Andrej Reutow
 * created on 17.09.2023
 * Расчет численности населения
 */
public class PopulationGrowth {
    public static void main(String[] args) {
        int population = 14_000_000;
        int birthRate = 14;
        int deathRate = 8;
        int years = 5;


        populationCalcLoop(population, birthRate,deathRate,years);
        System.out.println("Without loop");
        populationCalcWithoutLoop(population, birthRate,deathRate,years);
    }
    public static void populationCalcLoop(int population, int birthRate, int deathRate, int years){
        for (int year = 1; year <= years; year++) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + year);
            System.out.println("Рождаемость " + births + " в " + year + " году");
            System.out.println("Смертность " + deaths + " в " + year + " году");
            System.out.println("Прирост " + grow + " в " + year + " году");
            System.out.println("Население " + population + " в " + year + " году");
            System.out.println();
        }

        System.out.println("Population after " + years + " years: " + population);
    }
    public static void populationCalcWithoutLoop(int population, int birthRate, int deathRate, int years) {
        int currentYear = 1;
        // 1 год
        if (currentYear <= years) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + currentYear);
            System.out.println("Рождаемость " + births + " в " + currentYear + " году");
            System.out.println("Смертность " + deaths + " в " + currentYear + " году");
            System.out.println("Прирост " + grow + " в " + currentYear + " году");
            System.out.println("Население " + population + " в " + currentYear + " году");
            System.out.println();
            currentYear++;
        }
        // 2 год
        if (currentYear <= years) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + currentYear);
            System.out.println("Рождаемость " + births + " в " + currentYear + " году");
            System.out.println("Смертность " + deaths + " в " + currentYear + " году");
            System.out.println("Прирост " + grow + " в " + currentYear + " году");
            System.out.println("Население " + population + " в " + currentYear + " году");
            System.out.println();
            currentYear++;
        }
        // 3 год
        if (currentYear <= years) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + currentYear);
            System.out.println("Рождаемость " + births + " в " + currentYear + " году");
            System.out.println("Смертность " + deaths + " в " + currentYear + " году");
            System.out.println("Прирост " + grow + " в " + currentYear + " году");
            System.out.println("Население " + population + " в " + currentYear + " году");
            System.out.println();
            currentYear++;
        }
        // 4 год
        if (currentYear <= years) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + currentYear);
            System.out.println("Рождаемость " + births + " в " + currentYear + " году");
            System.out.println("Смертность " + deaths + " в " + currentYear + " году");
            System.out.println("Прирост " + grow + " в " + currentYear + " году");
            System.out.println("Население " + population + " в " + currentYear + " году");
            System.out.println();
            currentYear++;
        }
        // 5 год
        if (currentYear <= years) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + currentYear);
            System.out.println("Рождаемость " + births + " в " + currentYear + " году");
            System.out.println("Смертность " + deaths + " в " + currentYear + " году");
            System.out.println("Прирост " + grow + " в " + currentYear + " году");
            System.out.println("Население " + population + " в " + currentYear + " году");
            System.out.println();
            currentYear++;
        }
        // 6 год
        if (currentYear <= years) {
            int births = (population * birthRate) / 1000;
            int deaths = (population * deathRate) / 1000;
            int grow = (births - deaths);
            population += grow;
            System.out.println("Год " + currentYear);
            System.out.println("Рождаемость " + births + " в " + currentYear + " году");
            System.out.println("Смертность " + deaths + " в " + currentYear + " году");
            System.out.println("Прирост " + grow + " в " + currentYear + " году");
            System.out.println("Население " + population + " в " + currentYear + " году");
            System.out.println();
            currentYear++;
        }
    }
}

