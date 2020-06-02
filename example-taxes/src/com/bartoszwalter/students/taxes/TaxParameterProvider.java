package com.bartoszwalter.students.taxes;

import java.io.BufferedReader;

public class TaxParameterProvider {

    public TaxParameters getParameters() {
        double wynagrodzenieBrutto = 0;
        char umowa = ' ';
        try {
            java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Podaj kwotę dochodu: ");
            wynagrodzenieBrutto = Double.parseDouble(br.readLine());

            System.out.print("Typ umowy: (P)raca, (Z)lecenie: ");
            umowa = br.readLine().charAt(0);
        } catch (Exception ex) {
            System.out.println("Błędna kwota");
            System.err.println(ex);
        }
        return new TaxParameters(wynagrodzenieBrutto, umowa);
    }
}
