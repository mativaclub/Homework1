package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte apples = 50;
        short oranges = 250;
        int coconuts = 250000;
        long blueberries = 250000000L;
        float cocoa = 2.5f;
        double sugarcane = 250.50;

        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeightOfBoxers = firstBoxer + secondBoxer;
        System.out.println("Total Weight of Boxers " + totalWeightOfBoxers + " kg");

        float differenceOfWeightOfBoxers = secondBoxer - firstBoxer;
        System.out.println("Difference of the weight of Boxers " + differenceOfWeightOfBoxers + " kg");

        byte bananas = 80;
        int bananasWeight = bananas * 5;
        System.out.println("Bananas Weight " + bananasWeight + " g");

        byte milk = 105;
        int milkWeight = milk * 2;
        System.out.println("Milk Weight " + milkWeight + " g");

        byte iceCream = 100;
        int iceCreamWeight = iceCream * 2;
        System.out.println("Ice Cream Weight " + iceCreamWeight + " g");

        byte eggs = 70;
        int eggsWeight = eggs * 4;
        System.out.println("Eggs Weight " + eggsWeight + " g");

        int productsWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Total weight of products " + productsWeight + " g");

        float productWeightInKg = productsWeight / 1000f;
        System.out.println("Weight of products in kg " + productWeightInKg + " kg");

        byte kg = 7;
        int kgToGr = kg * 1000;
        System.out.println("Total weight for lost in gr " + kgToGr + " gr");

        int version250 = 250;
        int howManyDays1 = kgToGr /  version250;
        System.out.println("How Many Days version 250gr " + howManyDays1 + " days");

        int version500 = 500;
        int howManyDays2 = kgToGr /  version500;
        System.out.println("How Many Days version 500gr " + howManyDays2 + " days");

        int oneYearMonths = 12;

        int mashaMonthlySalary = 67760;
        System.out.println("Masha's Salary before was " + mashaMonthlySalary + " usd");
        float mashaSalary10Percent = mashaMonthlySalary + mashaMonthlySalary / 100f * 10;
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
