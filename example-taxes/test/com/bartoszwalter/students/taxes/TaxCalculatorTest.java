package com.bartoszwalter.students.taxes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    @Test
    void calculateTest() {
        TaxCalculator taxCalculator = new TaxCalculator();
        ResultCalculation resultCalculation = taxCalculator.calculate(5000, 'P');

        assertEquals(488, resultCalculation.getSkladkaEmerytalna(), 0.05);
        assertEquals(75, resultCalculation.getSkladkaRentowa(), 0.05);
        assertEquals(122.5, resultCalculation.getUbezpieczenieChorobowe(), 0.05);
        assertEquals(4314.5, resultCalculation.getoPodstawa(), 0.05);
        assertEquals(388.31, resultCalculation.getSkladkaZdrowotna1(), 0.05);
        assertEquals(334.37, resultCalculation.getSkladkaZdrowotna2(), 0.05);
        assertEquals(250, resultCalculation.getKosztyUzyskania(), 0.05);
        assertEquals(4064.5, resultCalculation.getPodstawaOpodatkowania(), 0.05);
        assertEquals(4064, resultCalculation.getPodstawaOpodatkowania(), 0.5);
        assertEquals(690.88, resultCalculation.getZaliczkaNaPodNaliczona(), 0.05);
        assertEquals(43.76, resultCalculation.getUlgaPodatkowa(), 0.05);
        assertEquals(647.12, resultCalculation.getPodatekPotracony(), 0.05);
        assertEquals(312.75, resultCalculation.getZaliczkaNaPodPotracona(), 0.05);
        assertEquals(313, resultCalculation.getZaliczkaNaPodPotraconaZaokr());
        assertEquals(3613.19, resultCalculation.getWynagrodzenieNetto(), 0.05);

    }
}