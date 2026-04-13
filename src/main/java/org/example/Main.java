package org.example;

public class Main {
    public static void main(String[] args) {
        String employeeName = "Глеб";
        String positionAtWork = "Старший шаурма-инженер";
        int ratePerShift = 16000;
        int numberOfShifts = 15;
        int award = 10000;
        int fine = 100;
        int price = 200;
        int numberOfSold = 3000;

        System.out.println("Сотрудник: " + employeeName + ", должность: " + positionAtWork);
        System.out.println("Зарплата без премии: " + numberOfShifts * ratePerShift);
        System.out.println("Итоговая зарплата: " + ((numberOfShifts * ratePerShift + award) - fine * 4));
        System.out.println("Выручка: " + price * numberOfSold);
    }
}