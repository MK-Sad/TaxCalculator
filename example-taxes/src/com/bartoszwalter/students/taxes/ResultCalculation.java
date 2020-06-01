package com.bartoszwalter.students.taxes;

public class ResultCalculation {

    private char umowa; //forma zatrudnienia
    private double wynagrodzenieBrutto;
    private double oPodstawa; //wynagrodzenieBrutto pomniejszone o składki ZUS, do obliczenia składki zdrow.
    private double skladkaEmerytalna; //9,76% wynagrodz.brutto
    private double skladkaRentowa; //1,5% pwynagrodz.brutto
    private double ubezpieczenieChorobowe; //2,45% wynagrodz.brutto
    private double skladkaZdrowotna1; //składka zdrowotna 9% oPodstawy (potrącona)
    private double skladkaZdrowotna2; //składka zdrowotna 7,75% oPodstawy (odliczona od podatku)
    private double kosztyUzyskania; //umowa o pracę: 250/m-c; umowa-zlecenie: 20%
    private double podstawaOpodatkowania; //wynagrodzenieBrutto pomniejszona o składkę emeryt., rent. i chorob. (umowa-zlecenie) oraz koszty uzysk. przych. (umowa o pracę)
    private double podstawaOpodatkowaniaZaokraglona; //zaokrąglona do pełnych złotych
    private double zaliczkaNaPodNaliczona; //naliczona zaliczka na podatek dochodowy
    private double ulgaPodatkowa; // kwota wolna od podatku
    private double podatekPotracony; //zaliczkaNaPodNaliczona po odjęciu ulgi podatkowej
    private double zaliczkaNaPodPotracona; //PodatekPotracony pomniejszony o składkę zdrowotną 7,75% (ulga z tyt. ubezp. zdrowotnego)
    private double zaliczkaNaPodPotraconaZaokr; //potrącona zaliczka na pod.doch. zaokrąglona do pełnych złotych
    private double wynagrodzenieNetto; //wynagrodzenieNetto netto, które otrzyma pracownik


    public char getUmowa() {
        return umowa;
    }

    public double getWynagrodzenieBrutto() {
        return wynagrodzenieBrutto;
    }

    public double getoPodstawa() {
        return oPodstawa;
    }

    public double getSkladkaEmerytalna() {
        return skladkaEmerytalna;
    }

    public double getSkladkaRentowa() {
        return skladkaRentowa;
    }

    public double getUbezpieczenieChorobowe() {
        return ubezpieczenieChorobowe;
    }

    public double getSkladkaZdrowotna1() {
        return skladkaZdrowotna1;
    }

    public double getSkladkaZdrowotna2() {
        return skladkaZdrowotna2;
    }

    public double getKosztyUzyskania() {
        return kosztyUzyskania;
    }

    public double getPodstawaOpodatkowania() {
        return podstawaOpodatkowania;
    }

    public double getPodstawaOpodatkowaniaZaokraglona() {
        return podstawaOpodatkowaniaZaokraglona;
    }

    public double getZaliczkaNaPodNaliczona() {
        return zaliczkaNaPodNaliczona;
    }

    public double getUlgaPodatkowa() {
        return ulgaPodatkowa;
    }

    public double getZaliczkaNaPodPotracona() {
        return zaliczkaNaPodPotracona;
    }

    public double getZaliczkaNaPodPotraconaZaokr() {
        return zaliczkaNaPodPotraconaZaokr;
    }

    public double getPodatekPotracony() {
        return podatekPotracony;
    }

    public double getWynagrodzenieNetto() {
        return wynagrodzenieNetto;
    }

    public void setUmowa(char umowa) {
        this.umowa = umowa;
    }

    public void setoPodstawa(double oPodstawa) {
        this.oPodstawa = oPodstawa;
    }

    public void setSkladkaEmerytalna(double skladkaEmerytalna) {
        this.skladkaEmerytalna = skladkaEmerytalna;
    }

    public void setSkladkaRentowa(double skladkaRentowa) {
        this.skladkaRentowa = skladkaRentowa;
    }

    public void setUbezpieczenieChorobowe(double ubezpieczenieChorobowe) {
        this.ubezpieczenieChorobowe = ubezpieczenieChorobowe;
    }

    public void setSkladkaZdrowotna1(double skladkaZdrowotna1) {
        this.skladkaZdrowotna1 = skladkaZdrowotna1;
    }

    public void setSkladkaZdrowotna2(double skladkaZdrowotna2) {
        this.skladkaZdrowotna2 = skladkaZdrowotna2;
    }

    public void setKosztyUzyskania(double kosztyUzyskania) {
        this.kosztyUzyskania = kosztyUzyskania;
    }

    public void setPodstawaOpodatkowania(double podstawaOpodatkowania) {
        this.podstawaOpodatkowania = podstawaOpodatkowania;
    }

    public void setPodstawaOpodatkowaniaZaokraglona(double podstawaOpodatkowaniaZaokraglona) {
        this.podstawaOpodatkowaniaZaokraglona = podstawaOpodatkowaniaZaokraglona;
    }

    public void setZaliczkaNaPodNaliczona(double zaliczkaNaPodNaliczona) {
        this.zaliczkaNaPodNaliczona = zaliczkaNaPodNaliczona;
    }

    public void setUlgaPodatkowa(double ulgaPodatkowa) {
        this.ulgaPodatkowa = ulgaPodatkowa;
    }

    public void setZaliczkaNaPodPotracona(double zaliczkaNaPodPotracona) {
        this.zaliczkaNaPodPotracona = zaliczkaNaPodPotracona;
    }

    public void setZaliczkaNaPodPotraconaZaokr(double zaliczkaNaPodPotraconaZaokr) {
        this.zaliczkaNaPodPotraconaZaokr = zaliczkaNaPodPotraconaZaokr;
    }

    public void setPodatekPotracony(double podatekPotracony) {
        this.podatekPotracony = podatekPotracony;
    }

    public void setWynagrodzenieNetto(double wynagrodzenieNetto) {
        this.wynagrodzenieNetto = wynagrodzenieNetto;
    }

    public void setWynagrodzenieBrutto(double wynagrodzenieBrutto) {
        this.wynagrodzenieBrutto = wynagrodzenieBrutto;
    }


}
