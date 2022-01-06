package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задача 1

        byte a = 5;
        short b = 10;
        int c = -100;
        long d = 1000L;
        float e = 1.77f;
        double f = 1.7777777;
        char g = 50000;
        boolean h = 10 > 5;

        //Задача 2
        float boxerOne = 78.2f;
        float boxerTwo = 82.7f;
        float totalWeightOfBoxers = boxerOne + boxerTwo;
        System.out.println("Total Weight of Boxers " + totalWeightOfBoxers + " kg");
        System.out.println("Total Weight of Boxers " + (boxerOne + boxerTwo) + " kg");
        float weightDifference = boxerOne - boxerTwo;
        System.out.println("Difference of the weight of Boxers " + weightDifference + " kg");
        System.out.println("Difference of the weight of Boxers " + Math.abs(boxerOne-boxerTwo) + " kg");

        System.out.println();

        //Задача 3
        byte banana = 5;
        int bananaWeight = 80;
        int totalBananas = banana * bananaWeight;
        System.out.println("Bananas Weight " + totalBananas + " g");

        int milkVolume = 200;
        int milkWeightPer100Ml = 105;
        int totalMilk = milkWeightPer100Ml * milkVolume / 100;
        System.out.println("Milk Weight " + totalMilk + " g");

        byte iceCream = 2;
        int iceCreamWeight = 100;
        int totalIceCream = iceCream * iceCreamWeight;
        System.out.println("Ice Cream Weight " + totalIceCream + " g");

        int eggs = 4;
        int eggWeight = 70;
        int totalEggWeight = eggs * eggWeight;
        System.out.println("Eggs Weight " + totalEggWeight + " g");

        int totalWeightOfBreakfast = totalBananas + totalMilk + totalIceCream + totalEggWeight;
        System.out.println("Total weight of products " + totalWeightOfBreakfast + " g");

        float totalWeightOfBreakfastInKg = totalWeightOfBreakfast / 1000f;
        System.out.println("Weight of products in kg " + totalWeightOfBreakfastInKg + " kg");

        System.out.println();

        //Задача 4
        byte kg = 7;
        int kgToGr = kg * 1000;
        System.out.println("Total weight for loose in gr is " + kgToGr + " gr");

        int diet250Gram = 250;
        int dietDays250Gram = kgToGr /  diet250Gram;
        System.out.println("How Many Days version 250gr " + dietDays250Gram + " days");

        int diet500Gram = 500;
        int dietDays500Gram = kgToGr /  diet500Gram;
        System.out.println("How Many Days version 500gr " + dietDays500Gram + " days");

        int approximateDaysOfDiet = (dietDays250Gram + dietDays500Gram) / 2;
        System.out.println("Approximately days for diet are " + approximateDaysOfDiet + " days");

        System.out.println();

        //Задача 5

        int oneYearMonths = 12;
        int percent = 10;

        int mashaMonthlySalary = 67760;
        System.out.println("Masha's Salary before was " + mashaMonthlySalary + " usd");
        float mashaSalary10Percent = mashaMonthlySalary + mashaMonthlySalary / 100f * 10;
       // float mashaSalary10Percent = mashaMonthlySalary * (1 + (percent / 100f * 10));
        System.out.println("Masha's Salary with 10% is " + mashaSalary10Percent + " usd");
        float mashaYearlySalaryBefore = mashaMonthlySalary * oneYearMonths;
        System.out.println("Masha's Yearly Salary before 10% was " + mashaYearlySalaryBefore + " usd");
        float mashaYearlySalaryAfter = mashaSalary10Percent * oneYearMonths;
        System.out.println("Masha's Yearly Salary after 10% is " + mashaYearlySalaryAfter + " usd");
        float mashaYearlyDifferenceOfSalaries = mashaYearlySalaryAfter - mashaYearlySalaryBefore;
        System.out.println("Masha's Yearly Difference of Salaries is " + mashaYearlyDifferenceOfSalaries + " usd");

        int denisMonthlySalary = 83690;
        System.out.println("Denis Salary before was " + denisMonthlySalary + " usd");
        float denisSalary10Percent = denisMonthlySalary + denisMonthlySalary / 100f * 10;
        System.out.println("Denis Salary with 10% is " + denisSalary10Percent + " usd");
        float denisYearlySalaryBefore = denisMonthlySalary * oneYearMonths;
        System.out.println("Denis Yearly Salary before 10% was " + denisYearlySalaryBefore + " usd");
        float denisYearlySalaryAfter = denisSalary10Percent * oneYearMonths;
        System.out.println("Denis Yearly Salary after 10% is " + denisYearlySalaryAfter + " usd");
        float denisYearlyDifferenceOfSalaries = denisYearlySalaryAfter - denisYearlySalaryBefore;
        System.out.println("Denis Yearly Difference of Salaries is " + denisYearlyDifferenceOfSalaries + " usd");

        int kristinaMonthlySalary = 76230;
        System.out.println("Kristina's Salary before was " + kristinaMonthlySalary + " usd");
        float kristinaSalary10Percent = kristinaMonthlySalary + kristinaMonthlySalary / 100f * 10;
        System.out.println("Kristina's Salary with 10% is " + kristinaSalary10Percent + " usd");
        float kristinaYearlySalaryBefore = kristinaMonthlySalary * oneYearMonths;
        System.out.println("Kristina's Yearly Salary before 10% was " + kristinaYearlySalaryBefore + " usd");
        float kristinaYearlySalaryAfter = kristinaSalary10Percent * oneYearMonths;
        System.out.println("Kristina's Yearly Salary after 10% is " + kristinaYearlySalaryAfter + " usd");
        float kristinaYearlyDifferenceOfSalaries = kristinaYearlySalaryAfter - kristinaYearlySalaryBefore;
        System.out.println("Kristina's Yearly Difference of Salaries is " + kristinaYearlyDifferenceOfSalaries + " usd");


    }
}
