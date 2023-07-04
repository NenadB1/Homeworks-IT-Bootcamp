package domaci16;



public class Zadatak2 {
    public static void main(String[] args) {

        Converter converter1 = new Converter();

        converter1.konverter(101, Currency.USD);
        converter1.konverter(101, Currency.AUD);
        converter1.konverter(101, Currency.GBP);
        converter1.konverter(101, Currency.RUB);
        converter1.konverter(101, Currency.EUR);
        converter1.konverter(101, Currency.CAD);


    }
}
