package ru.alfabank.task3;

import java.util.Scanner;

public class DiscountCalculator {
    private String discount;

    static void main() {
        Scanner scan = new Scanner(System.in);
        DiscountCalculator discCalc = new DiscountCalculator();
        System.out.println("Please, enter your coupon:");
        discCalc.discount = scan.next();
        switch (discCalc.discount.toUpperCase()) {
            case ("SALE20"):
                System.out.println("Your discount is 20%!");
                break;
            case("SALE50"): case ("HALF_OFF"):
                System.out.println("Your discount is 50%!");
                break;
            case ("PROMO_NEW"):
                System.out.println("Your discount is 80%!");
                break;
            default:
                System.out.println("Sorry, coupon not recognized");
        }
        scan.close();
    }
}
