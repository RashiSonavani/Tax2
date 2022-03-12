package com.company;

public class Main {

    public static void main(String[] args) {
        double PriceWithoutVAT = 9.99;
        System.out.println("Price Without VAT: " + PriceWithoutVAT);

        double PriceWithVAT = PriceWithoutVAT * 1.23;
        System.out.println("Price With VAT: " + PriceWithVAT);

        double ValueWithVAT = PriceWithVAT * 10000;
        System.out.println("Value With VAT: " + ValueWithVAT);

        double PricewithoutVAT2 = ValueWithVAT / 1.23;
        System.out.println("Value Without VAT: " + PricewithoutVAT2);


         //Now here we are using The BigDeciaml Class
                System.out.println("");
        System.out.println("Same thing after using Big Decimal");
    }
}
