package com.bartoszwalter.students.taxes;

import java.text.DecimalFormat;

public class TaxCalculator {

    public static double wynagrodzenieBrutto = 0;
    public static char umowa = ' ';

    DecimalFormat df00 = new DecimalFormat("#.00");
    DecimalFormat df = new DecimalFormat("#");

    public ResultCalculation calculate(double wynagrodzenieBrutto, char umowa) {

        ResultCalculation result = new ResultCalculation();
        result.setUmowa(umowa);
        result.setWynagrodzenieBrutto(wynagrodzenieBrutto);

        double skladkaEmerytalna = (wynagrodzenieBrutto * 9.76) / 100;
        double skladkaRentowa = (wynagrodzenieBrutto * 1.5) / 100;
        double ubezpieczenieChorobowe = (wynagrodzenieBrutto * 2.45) / 100;
        double oPodstawa = (wynagrodzenieBrutto - skladkaEmerytalna - skladkaRentowa - ubezpieczenieChorobowe);
        double skladkaZdrowotna1 = (oPodstawa * 9) / 100;
        double skladkaZdrowotna2 = (oPodstawa * 7.75) / 100;
        double kosztyUzyskania = 0;

        if (umowa == 'P') {
            kosztyUzyskania = 250;
        }
        else if (umowa == 'Z') {
            kosztyUzyskania = (oPodstawa * 20) / 100;
        }

        double podstawaOpodatkowania = oPodstawa - kosztyUzyskania;
        double podstawaOpodatkowaniaZaokraglona = Double.parseDouble(df.format(podstawaOpodatkowania));
        double zaliczkaNaPodNaliczona = (podstawaOpodatkowaniaZaokraglona * 17) / 100;

        double ulgaPodatkowa = 0;
                if (umowa == 'P') {
            ulgaPodatkowa = 43.76;
        }
        else if (umowa == 'Z') {
            ulgaPodatkowa = 0;
        }

        double podatekPotracony = zaliczkaNaPodNaliczona - ulgaPodatkowa;
        double zaliczkaNaPodPotracona = podatekPotracony - skladkaZdrowotna2;
        double zaliczkaNaPodPotraconaZaokr = Double.parseDouble(df.format(zaliczkaNaPodPotracona));
        double wynagrodzenieNetto = wynagrodzenieBrutto - ((skladkaEmerytalna + skladkaRentowa + ubezpieczenieChorobowe) + skladkaZdrowotna1 + zaliczkaNaPodPotraconaZaokr);

        result.setoPodstawa(oPodstawa);
        result.setSkladkaEmerytalna(skladkaEmerytalna);
        result.setSkladkaRentowa(skladkaRentowa);
        result.setUbezpieczenieChorobowe(ubezpieczenieChorobowe);
        result.setSkladkaZdrowotna1(skladkaZdrowotna1);
        result.setSkladkaZdrowotna2(skladkaZdrowotna2);
        result.setKosztyUzyskania(kosztyUzyskania);
        result.setPodstawaOpodatkowania(podstawaOpodatkowania);
        result.setPodstawaOpodatkowaniaZaokraglona(podstawaOpodatkowaniaZaokraglona);
        result.setZaliczkaNaPodNaliczona(zaliczkaNaPodNaliczona);
        result.setUlgaPodatkowa(ulgaPodatkowa);
        result.setPodatekPotracony(podatekPotracony);
        result.setZaliczkaNaPodPotracona(zaliczkaNaPodPotracona);
        result.setZaliczkaNaPodPotraconaZaokr(zaliczkaNaPodPotraconaZaokr);
        result.setWynagrodzenieNetto(wynagrodzenieNetto);

        return result;

    }

}
