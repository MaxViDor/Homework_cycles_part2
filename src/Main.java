public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int sum = 0;
        int month = 0;

        while (sum < 2459000) {
            month++;
            sum += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }

        System.out.println("Необходимо " + month + " месяцев для накопления суммы в " + sum + " рублей");;
    }
    public static void task2 () {
        System.out.println("Задача 2");
        // вывод чисел от 1 до 10 с помощью цикла while
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

// вывод чисел от 10 до 1 с помощью цикла for
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;

        for (int year = 1; year <= 10; year++) {
            int births = (int) Math.round(population * birthRate / 1000.0);
            int deaths = (int) Math.round(population * deathRate / 1000.0);
            population += births - deaths;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deposit = 15000;
        int target = 12000000;
        int months = 0;

        while (deposit < target) {
            deposit += deposit * 0.07;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений составляет " + deposit);
        }

        System.out.println("Для достижения цели в " + target + " рублей Василию понадобится " + months + " месяцев.");

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int deposit = 15000;
        int target = 12000000;
        int months = 0;

        while (deposit < target) {
            deposit += deposit * 0.07;
            months++;
            if (months % 6 == 0) { // проверяем, является ли номер месяца кратным 6
                System.out.println("Месяц " + months + ", сумма накоплений составляет " + deposit);
            }
        }

        System.out.println("Для достижения цели в " + target + " рублей Василию понадобится " + months + " месяцев.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int deposit = 15000;
        int target = 0;
        int months = 0;

        for (int i = 1; i <= 108; i++) { // 9 лет = 108 месяцев
            deposit += deposit * 0.07;
            months++;
            if (months % 6 == 0) { // проверяем, является ли номер месяца кратным 6
                target = deposit - 15000; // вычисляем сумму накоплений за полгода
                System.out.println("Накопления за " + (months/12) + " год " + ((months%12)/6 + 1) + " полугодие: " + target);
            }
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 6; // номер первой пятницы в месяце (6 - это пятница, 1 - это понедельник)

        for (int i = 1; i <= 31; i++) {
            if ((i - 1) % 7 == firstFriday - 1) { // проверяем, является ли текущий день пятницей
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8 () {
        System.out.println("Заача 8");
        int currentYear = 2021;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometYear = 0;

        for (int i = startYear; i <= endYear; i++) {
            if ((i % 79) == 0) { // проверяем, является ли год кратным 79
                cometYear = i;
                System.out.println("Комета пролетала в " + cometYear);
            }
        }

        int nextCometYear = cometYear + 79;
        System.out.println("Следующий год появления кометы: " + nextCometYear);

    }
}