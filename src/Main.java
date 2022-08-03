public class Main {
    public static void main(String[] args) {
        // Задание 1. Объявить все пройденные в уроке типы еременных. Присвоить значения переменным

        byte flower = 10;
        short cat = 11;
        int fox = 1000;
        long book = 2000L;
        float oilVolume = 65.27f;
        double oatmealWeight = 0.84796;
        boolean catIsOld = cat >= 12;
        char bar = 47;
        System.out.println(catIsOld);

        // Задание 2.

       double firstFighterWeight = 78.2;
       double secondFighterWeight = 82.7;
       double commonWeight = firstFighterWeight + secondFighterWeight;
       System.out.println("Общий вес двух бойцов " + commonWeight + " кг");

       double firstWeight = 78.2;
       double secondWeight = 82.7;
       double weightDifference = secondWeight - firstWeight;
       System.out.println("Разница между весами бойцов " + weightDifference + " кг");

       // Вопрос: я использовала переменную double и с ней все сработало, но не сработало с float, когда я пробовала. Почему так?

       // Задание 3.

        int bananasWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 100 * 2;
        int rawEggsWeight = 70 * 4;
        int breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + rawEggsWeight;
        System.out.println("Общий вес завтрака " + breakfastWeight + " г");

        int breakfastWeightG = 1090;
        float breakfastWeightKilo = 1090 / 1000;
        System.out.println(breakfastWeightKilo);

        // Вопрос: в последнем тут можно int или обязательно float?

        // Задание 4.

        int sportsmenWeight = 7;
        int sportsmenWeightG = 7 * 1000;
        System.out.println(sportsmenWeightG);

        int weightLossDaysLong = 7000 / 250;
        System.out.println(weightLossDaysLong);

        int weightLossDaysShort = 7000 / 500;
        System.out.println(weightLossDaysShort);

        int weightLossLong = 28;
        int weightLossShort = 14;
        int weightLossOverall = 28 + 14;
        System.out.println(weightLossOverall);

        int weightLossMedium = weightLossOverall / 2;
        System.out.println(weightLossMedium);

        // Вопрос: в критериях написано, что нужно верно сделать операцию остатка деления, но мне кажется все и так получилось :D Не понимаю, как тут сделать операцию остатка деления

        // Задание 5.

        int mashaSalary = 67760;
        int mashaSalaryNew1 = 67760 / 100;
        System.out.println(mashaSalaryNew1);
        int mashaSalaryNew2 = 677 * 10;
        System.out.println(mashaSalaryNew2);
        int mashaSalaryNew3 = mashaSalary + mashaSalaryNew2;
        System.out.println("Маша теперь получает " + mashaSalaryNew3);
        int mashaAnnualOld = 67760 * 12;
        System.out.println(mashaAnnualOld);
        int mashaAnnualNew = 74530 * 12;
        System.out.println(mashaAnnualNew);
        int incomeDifferenceM = mashaAnnualNew - mashaAnnualOld;
        System.out.println("Годовой доход вырос на " + incomeDifferenceM);


        int denisSalary = 83690;
        int denisSalaryNew1 = 83690 / 100;
        System.out.println(denisSalaryNew1);
        int denisSalaryNew2 = 836 * 10;
        System.out.println(denisSalaryNew2);
        int denisSalaryNew3 = denisSalary + denisSalaryNew2;
        System.out.println("Денис теперь получает " + denisSalaryNew3);
        int denisAnnualOld = 83690 * 12;
        System.out.println(denisAnnualOld);
        int denisAnnualNew = 92050 * 12;
        System.out.println(denisAnnualNew);
        int incomeDifferenceD = denisAnnualNew - denisAnnualOld;
        System.out.println("Годовой доход вырос на " + incomeDifferenceD);

        int chrisSalary = 76230;
        int chrisSalaryNew1 = 76230 / 100;
        System.out.println(chrisSalaryNew1);
        int chrisSalaryNew2 = 762 * 10;
        System.out.println(chrisSalaryNew2);
        int chrisSalaryNew3 = chrisSalary + chrisSalaryNew2;
        System.out.println("Кристина теперь полуучает " + chrisSalaryNew3);
        int chrisAnnualOld = 76230 * 12;
        System.out.println(chrisAnnualOld);
        int chrisAnnualNew = 83850 * 12;
        System.out.println(chrisAnnualNew);
        int incomeDifferenceC = chrisAnnualNew - chrisAnnualOld;
        System.out.println("Годовой доход вырос на " + incomeDifferenceC);


















    }
}