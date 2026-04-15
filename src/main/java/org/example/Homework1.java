package org.example;

public class Homework1 {
    public static void main(String[] args) {
        String employeeName = "Глеб";
        String positionAtWork = "Старший шаурма-инженер";
        int ratePerShift = 16000;
        int numberOfShifts = 15;
        int bonus = 10000;
        int fineForBurntShawarma = 100;
        int priceOfShawarma = 200;
        int quantitySold = 3000;

        int salaryWithoutBonus = numberOfShifts * ratePerShift;
        int finalSalary = ((numberOfShifts * ratePerShift + bonus) - fineForBurntShawarma * 4);
        int revenue = priceOfShawarma * quantitySold;

        System.out.println("Сотрудник: " + employeeName);
        System.out.println("Должность: " + positionAtWork);
        System.out.println("Зарплата без премии: " + salaryWithoutBonus);
        System.out.println("Итоговая зарплата: " + finalSalary);
        System.out.println("Выручка: " + revenue);
    }
}