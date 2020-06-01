package com.bartoszwalter.students.taxes;

import java.io.BufferedReader;


public class TaxCalculatorApp {


    public static void main(String[] args) {
        try {
            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Podaj kwotę dochodu: ");
            double wynagrodzenieBrutto = Double.parseDouble(br.readLine());

            System.out.print("Typ umowy: (P)raca, (Z)lecenie: ");
            char umowa = br.readLine().charAt(0);


            TaxCalculator taxCalculator = new TaxCalculator();
            TaxPrinter taxPrinter = new TaxPrinter();
            taxPrinter.printSalaryComponents(taxCalculator.calculate(wynagrodzenieBrutto, umowa));

        } catch (Exception ex) {
            System.out.println("Błędna kwota");
            System.err.println(ex);
            return;
        }
    }
}
