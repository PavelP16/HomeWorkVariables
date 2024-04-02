public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача №1_______________________________________________________________________________");
        int i = 125200;
        byte b = 100;
        short s = 27000;
        long l = 10_000_000_000l;
        float f = 2.2f;
        double d = 2.3321;
        System.out.printf("Значение переменой i с типом int равно %s\n", i);
        System.out.printf("Значение переменой b с типом byte равно %s\n", b);
        System.out.printf("Значение переменой s с типом short равно %s\n", s);
        System.out.printf("Значение переменой l с типом long равно %s\n", l);
        System.out.printf("Значение переменой f с типом float равно %s\n", f);
        System.out.printf("Значение переменой d с типом double равно %s\n", d);

        System.out.println("\nЗадача №2_______________________________________________________________________________");
        double d1 = 27.12;
        long l1 = 987_678_965_549L;
        float f1 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        int i2 = 27898;
        byte b1 = 67;

        System.out.println("\nЗадача №3_______________________________________________________________________________");
        byte ludmilaStudentsAmount = 23;
        byte annaStudentsAmount = 27;
        byte ekaterinaStudentsAmount = 30;
        short paperAmount = 480;
        short allStudentsAmount = (short) (ludmilaStudentsAmount + annaStudentsAmount + ekaterinaStudentsAmount);
        double paperPerStudent = (double) paperAmount / allStudentsAmount;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + "  листов бумаги.");

        System.out.println("\nЗадача №4_______________________________________________________________________________");
        int machinePerformance = 16;
        int minute = 2;
        int machinePerformanceMinute = machinePerformance / minute;
        int machinePerformancePerTwentyMinutes = machinePerformanceMinute * 20;
        int minutesPerDay = 60 * 24;
        int machinePerformancePerDay = machinePerformanceMinute * minutesPerDay;
        int machinePerformancePerThreeDays = machinePerformancePerDay * 3;
        int machinePerformancePerMonth = machinePerformancePerDay * 31;
        System.out.printf("«За 20 минут машина произвела %s штук бутылок».\n", machinePerformancePerTwentyMinutes);
        System.out.printf("«За день минут машина произвела %s штук бутылок».\n", machinePerformancePerDay);
        System.out.printf("«За 3 дня машина произвела %s штук бутылок».\n", machinePerformancePerThreeDays);
        System.out.printf("«За месяц машина произвела %s штук бутылок».\n", machinePerformancePerMonth);

        System.out.println("\nЗадача №5_______________________________________________________________________________");
        int allCenAmount = 120;
        int whiteCenPeClass = 2;
        int brownCenPerClass = 4;
        int cenPerClass = whiteCenPeClass + brownCenPerClass;
        int amountOfClasses = allCenAmount / cenPerClass;
        int whiteCenAmountAll = whiteCenPeClass * amountOfClasses;
        int brownCenAmountAll = brownCenPerClass * amountOfClasses;
        System.out.println("«В школе, где " + amountOfClasses + " классов, " + "нужно " + whiteCenAmountAll + " банок белой краски и " + brownCenAmountAll + " банок коричневой краски».\n");

        System.out.println("\nЗадача №6_______________________________________________________________________________");
        int bananasAmount = 5;
        int milkAmount = 200;
        int iceCreamAmount = 2;
        int eggsAmount = 4;

        int bananasWeight = bananasAmount * 80;
        int milkWeight = milkAmount / 100 * 105;
        int iceWeight = iceCreamAmount * 100;
        int eggsWeight = eggsAmount * 70;

        int breakfastWeight = bananasWeight + milkWeight + iceWeight + eggsWeight;
        double breakfastWeightInKilo = (double) breakfastWeight / 1000;
        System.out.println("breakfastWeight=  " + breakfastWeight);
        System.out.println("breakfastWeightInKilo=  " + breakfastWeightInKilo);

        System.out.println("\nЗадача №7_______________________________________________________________________________");
        int manWeightInKilo = 7;
        int manWeightInGrams = manWeightInKilo * 1000;
        double minDays = (double) manWeightInGrams / 500;
        double maxDays = (double) manWeightInGrams / 250;
        double averageDays = (maxDays + minDays) / 2;
        System.out.println("minDays= " + minDays);
        System.out.println("maxDays= " + maxDays);
        System.out.println("averageDays= " + averageDays);

        System.out.println("\nЗадача №8_______________________________________________________________________________");
        double percent = 1.1;
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaSalaryYear = mashaSalary * 12;
        int denisSalaryYear = denisSalary * 12;
        int kristinaSalaryYear = kristinaSalary * 12;

        int mashaNewSalary = (int) (mashaSalary * percent);
        int denisNewSalary = (int) (denisSalary * percent);
        int kristinaNewSalary = (int) (kristinaSalary * percent);

        int mashaNewSalaryYear = mashaNewSalary * 12;
        int denisNewSalaryYear = denisNewSalary * 12;
        int kristinaNewSalaryYear = kristinaNewSalary * 12;


        int mashaYearDifSalary = mashaNewSalaryYear - mashaSalaryYear;
        int denisYearDifSalary = denisNewSalaryYear - denisSalaryYear;
        int kristinaYearDifSalary = kristinaNewSalaryYear - kristinaSalaryYear;

        System.out.println("«Маша теперь получает " + mashaNewSalary + "рублей. Годовой доход вырос на " + mashaYearDifSalary + " рублей».");
        System.out.println("«Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearDifSalary + " рублей».");
        System.out.println("«Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaYearDifSalary + " рублей».");



    }
}
