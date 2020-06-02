package com.bartoszwalter.students.taxes;

public class TaxCalculatorApp {


    public static void main(String[] args) {
        TaxParameterProvider taxParameterProvider = new TaxParameterProvider();
        TaxParameters taxParameters = taxParameterProvider.getParameters();
        TaxCalculator taxCalculator = new TaxCalculator();
        ResultCalculation resultCalculation =
                taxCalculator.calculate(taxParameters.getWynagrodzenieBrutto(), taxParameters.getUmowa());
        TaxPrinter taxPrinter = new TaxPrinter();
        taxPrinter.print(taxPrinter.preparePrint(resultCalculation));

    }
}
