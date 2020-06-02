package com.bartoszwalter.students.taxes;

public class TaxParameters {

    private double wynagrodzenieBrutto;
    private char umowa;

    public TaxParameters(double wynagrodzenieBrutto, char umowa) {
        this.wynagrodzenieBrutto = wynagrodzenieBrutto;
        this.umowa = umowa;
    }

    public double getWynagrodzenieBrutto() {
        return wynagrodzenieBrutto;
    }

    public char getUmowa() {
        return umowa;
    }

}
