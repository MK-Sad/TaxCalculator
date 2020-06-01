package com.bartoszwalter.students.taxes;

import java.text.DecimalFormat;

public class TaxPrinter {

    DecimalFormat df00 = new DecimalFormat("#.00");
    DecimalFormat df = new DecimalFormat("#");

    public void printSalaryComponents(ResultCalculation resultCalculation) {

        if (resultCalculation.getUmowa() == 'P') {
            System.out.println("UMOWA O PRACĘ");
        } else if (resultCalculation.getUmowa() == 'Z') {
            System.out.println("UMOWA-ZLECENIE");
        } else {
            System.out.println("Nieznany typ umowy!");
        }

        System.out.println("Podstawa wymiaru składek " + resultCalculation.getWynagrodzenieBrutto());
        System.out.println("Składka na ubezpieczenie emerytalne " + df00.format(resultCalculation.getSkladkaEmerytalna()));
        System.out.println("Składka na ubezpieczenie rentowe " + df00.format(resultCalculation.getSkladkaRentowa()));
        System.out.println("Składka na ubezpieczenie chorobowe " + df00.format(resultCalculation.getUbezpieczenieChorobowe()));
        System.out.println("Podstawa wymiaru składki na ubezpieczenie zdrowotne: " + resultCalculation.getoPodstawa());
        System.out.println("Składka na ubezpieczenie zdrowotne: 9% = " + df00.format(resultCalculation.getSkladkaZdrowotna1()) + " 7,75% = " + df00.format(resultCalculation.getSkladkaZdrowotna2()));

        if (resultCalculation.getUmowa() == 'P') {
            System.out.println("Koszty uzyskania przychodu w stałej wysokości " + resultCalculation.getKosztyUzyskania());
        } else if (resultCalculation.getUmowa() == 'Z') {
            System.out.println("Koszty uzyskania przychodu w stałej wysokości 20%: " + resultCalculation.getKosztyUzyskania());
        }
        System.out.println("Podstawa opodatkowania " + resultCalculation.getPodstawaOpodatkowania() + " zaokrąglona " + df.format(resultCalculation.getPodstawaOpodatkowaniaZaokraglona()));
        System.out.println("Zaliczka na podatek dochodowy 17 % = " + resultCalculation.getZaliczkaNaPodNaliczona());
        System.out.println("Kwota wolna od podatku = " + resultCalculation.getUlgaPodatkowa());
        System.out.println("Podatek potrącony = " + df00.format(resultCalculation.getPodatekPotracony()));
        System.out.println("Zaliczka do urzędu skarbowego = " + df00.format(resultCalculation.getZaliczkaNaPodPotracona())
                + " po zaokrągleniu = " + df.format(resultCalculation.getZaliczkaNaPodPotraconaZaokr()));
        System.out.println();
        System.out.println("Pracownik otrzyma wynagrodzenie netto w wysokości = " + df00.format(resultCalculation.getWynagrodzenieNetto()));

    }
}