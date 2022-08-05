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

        // Задание 5.

        float mashaSalary = 67760f;
        float mashaSalaryNew1 = 67760f / 100;
        System.out.println(mashaSalaryNew1);
        float mashaSalaryNew2 = 677.6f * 10;
        System.out.println(mashaSalaryNew2);
        float mashaSalaryNew3 = mashaSalary + mashaSalaryNew2;
        System.out.println("Маша теперь получает " + mashaSalaryNew3);
        float mashaAnnualOld = 67760f * 12;
        System.out.println(mashaAnnualOld);
        float mashaAnnualNew = 74536f * 12;
        System.out.println(mashaAnnualNew);
        float incomeDifferenceM = mashaAnnualNew - mashaAnnualOld;
        System.out.println("Годовой доход вырос на " + incomeDifferenceM);


        float denisSalary = 83690f;
        float denisSalaryNew1 = 83690f / 100;
        System.out.println(denisSalaryNew1);
        float denisSalaryNew2 = 836.9f * 10;
        System.out.println(denisSalaryNew2);
        float denisSalaryNew3 = denisSalary + denisSalaryNew2;
        System.out.println("Денис теперь получает " + denisSalaryNew3);
        float denisAnnualOld = 83690f * 12;
        System.out.println(denisAnnualOld);
        float denisAnnualNew = 92059f * 12;
        System.out.println(denisAnnualNew);
        float incomeDifferenceD = denisAnnualNew - denisAnnualOld;
        System.out.println("Годовой доход вырос на " + incomeDifferenceD);

        float chrisSalary = 76230f;
        float chrisSalaryNew1 = 76230f / 100;
        System.out.println(chrisSalaryNew1);
        float chrisSalaryNew2 = 762.3f * 10;
        System.out.println(chrisSalaryNew2);
        float chrisSalaryNew3 = chrisSalary + chrisSalaryNew2;
        System.out.println("Кристина теперь полуучает " + chrisSalaryNew3);
        float chrisAnnualOld = 76230f * 12;
        System.out.println(chrisAnnualOld);
        float chrisAnnualNew = 838533f * 12;
        System.out.println(chrisAnnualNew);
        float incomeDifferenceC = chrisAnnualNew - chrisAnnualOld;
        System.out.println("Годовой доход вырос на " + incomeDifferenceC);

        //Вроде бы получилось, но вопрос нужно ли писать так, к примеру, "100428.0" или достаточно "100428". Также при замене переменной не стала менять механику решения (сокращать), чтобы не запутаться



















    }
}