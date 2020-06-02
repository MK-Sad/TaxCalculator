package com.bartoszwalter.students.taxes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxPrinterTest {

    @Test
    void preparePrintTest() {

        ResultCalculation resultCalculation = new ResultCalculation();

        resultCalculation.setUmowa('P');
        resultCalculation.setWynagrodzenieBrutto(5000);
        resultCalculation.setSkladkaEmerytalna(488);
        resultCalculation.setSkladkaRentowa(75);
        resultCalculation.setUbezpieczenieChorobowe(122.5);
        resultCalculation.setoPodstawa(4314.5);
        resultCalculation.setSkladkaZdrowotna1(388.31);
        resultCalculation.setSkladkaZdrowotna2(334.37);
        resultCalculation.setKosztyUzyskania(250);
        resultCalculation.setPodstawaOpodatkowania(4064.5);
        resultCalculation.setPodstawaOpodatkowaniaZaokraglona(4064);
        resultCalculation.setZaliczkaNaPodNaliczona(690.88);
        resultCalculation.setUlgaPodatkowa(43.76);
        resultCalculation.setPodatekPotracony(647.12);
        resultCalculation.setZaliczkaNaPodPotracona(312.75);
        resultCalculation.setZaliczkaNaPodPotraconaZaokr(313);
        resultCalculation.setWynagrodzenieNetto(3613.19);

        TaxPrinter printer = new TaxPrinter();
        String result = getWithoutLineSeparators(printer.preparePrint(resultCalculation));

        String expected = getWithoutLineSeparators("UMOWA O PRACĘ\n" +
                "Podstawa wymiaru składek 5000.0\n" +
                "Składka na ubezpieczenie emerytalne 488,00\n" +
                "Składka na ubezpieczenie rentowe 75,00\n" +
                "Składka na ubezpieczenie chorobowe 122,50\n" +
                "Podstawa wymiaru składki na ubezpieczenie zdrowotne: 4314.5\n" +
                "Składka na ubezpieczenie zdrowotne: 9% = 388,31 7,75% = 334,37\n" +
                "Koszty uzyskania przychodu w stałej wysokości 250.0\n" +
                "Podstawa opodatkowania 4064.5 zaokrąglona 4064\n" +
                "Zaliczka na podatek dochodowy 17 % = 690.88\n" +
                "Kwota wolna od podatku = 43.76\n" +
                "Podatek potrącony = 647,12\n" +
                "Zaliczka do urzędu skarbowego = 312,75 po zaokrągleniu = 313\n" +
                "\n" +
                "Pracownik otrzyma wynagrodzenie netto w wysokości = 3613,19");

        assertEquals(expected, result);
    }

    private String getWithoutLineSeparators(String text) {
        return text.replace("\n", "").replace("\r", "");
    }
}