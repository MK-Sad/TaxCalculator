package com.bartoszwalter.students.taxes;

import java.text.DecimalFormat;

public class TaxPrinter {

    DecimalFormat df00 = new DecimalFormat("#.00");
    DecimalFormat df = new DecimalFormat("#");


    public String preparePrint(ResultCalculation resultCalculation) {

        StringBuilder content = new StringBuilder();

        if (resultCalculation.getUmowa() == 'P') {
            content.append("UMOWA O PRACĘ");
        } else if (resultCalculation.getUmowa() == 'Z') {
            content.append("UMOWA-ZLECENIE");
        } else {
            content.append("Nieznany typ umowy!");
            return content.toString();
        }
        content.append(System.getProperty("line.separator"));
        content.append("Podstawa wymiaru składek ").append(resultCalculation.getWynagrodzenieBrutto());
        content.append(System.getProperty("line.separator"));
        content.append("Składka na ubezpieczenie emerytalne ")
                .append(df00.format(resultCalculation.getSkladkaEmerytalna()));
        content.append(System.getProperty("line.separator"));
        content.append("Składka na ubezpieczenie rentowe ")
                .append(df00.format(resultCalculation.getSkladkaRentowa()));
        content.append(System.getProperty("line.separator"));
        content.append("Składka na ubezpieczenie chorobowe ")
                .append(df00.format(resultCalculation.getUbezpieczenieChorobowe()));
        content.append(System.getProperty("line.separator"));
        content.append("Podstawa wymiaru składki na ubezpieczenie zdrowotne: ")
                .append(resultCalculation.getoPodstawa());
        content.append(System.getProperty("line.separator"));
        content.append("Składka na ubezpieczenie zdrowotne: 9% = ")
                .append(df00.format(resultCalculation.getSkladkaZdrowotna1()))
                .append(" 7,75% = ").append(df00.format(resultCalculation.getSkladkaZdrowotna2()));
        content.append(System.getProperty("line.separator"));

        if (resultCalculation.getUmowa() == 'P') {
            content.append("Koszty uzyskania przychodu w stałej wysokości ")
                    .append(resultCalculation.getKosztyUzyskania());
        } else if (resultCalculation.getUmowa() == 'Z') {
            content.append("Koszty uzyskania przychodu w stałej wysokości 20%: ")
                    .append(resultCalculation.getKosztyUzyskania());
        }

        content.append(System.getProperty("line.separator"));
        content.append("Podstawa opodatkowania ").append(resultCalculation.getPodstawaOpodatkowania())
                .append(" zaokrąglona ").append(df.format(resultCalculation.getPodstawaOpodatkowaniaZaokraglona()));
        content.append(System.getProperty("line.separator"));
        content.append("Zaliczka na podatek dochodowy 17 % = ").append(resultCalculation.getZaliczkaNaPodNaliczona());
        content.append(System.getProperty("line.separator"));
        content.append("Kwota wolna od podatku = ").append(resultCalculation.getUlgaPodatkowa());
        content.append(System.getProperty("line.separator"));
        content.append("Podatek potrącony = ").append(df00.format(resultCalculation.getPodatekPotracony()));
        content.append(System.getProperty("line.separator"));
        content.append("Zaliczka do urzędu skarbowego = ").append(df00.format(resultCalculation.getZaliczkaNaPodPotracona()))
                .append(" po zaokrągleniu = ").append(df.format(resultCalculation.getZaliczkaNaPodPotraconaZaokr()));
        content.append(System.getProperty("line.separator"));
        content.append(System.getProperty("line.separator"));
        content.append("Pracownik otrzyma wynagrodzenie netto w wysokości = ")
                .append(df00.format(resultCalculation.getWynagrodzenieNetto()));

        return content.toString();
    }

    public void print(String content) {
        System.out.println(content);
    }
}