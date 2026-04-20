package org.example;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        Random random = new Random();

        int ageVisitor = random.nextInt(100);
        double amountOnTheAccount = random.nextDouble(100_000);
        boolean existInvitation = random.nextBoolean();
        boolean inBlacklist = random.nextBoolean();

        boolean scoringResult;
        double voluntaryContribution = 7.5 * amountOnTheAccount/100;
        String roundedContribution = String.format("%.2f",voluntaryContribution);


        if (ageVisitor >= 18 && (amountOnTheAccount > 50_000 || existInvitation) && inBlacklist){
            scoringResult = true;
        } else scoringResult = false;

        System.out.println("Посетитель проходит? - " + scoringResult);
        System.out.println("Сумма взноса - " + roundedContribution + " денег");
    }
}
