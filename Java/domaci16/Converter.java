package domaci16;

public class Converter {

    private int rsd;

    private Currency currency;

    public Converter(){

    }

    public Converter(int rsd){
        this.rsd = rsd;
    }

    public void setRsd(int rsd) {
        this.rsd = rsd;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void konverter(int rsd, Currency currency){
       double exchangedAmount = 1;

        switch(currency){
            case EUR:
            exchangedAmount = rsd * 117.28;
            break;
            case AUD:
                exchangedAmount = rsd * 71.24;
                break;
            case CAD:
                exchangedAmount = rsd * 80.23;
                break;
            case GBP:
                exchangedAmount = rsd * 134.77;
                break;
            case RUB:
                exchangedAmount = rsd * 1.36;
                break;
            case USD:
                exchangedAmount = rsd * 109.21;
                break;
        }
        System.out.println("Converted amount in desired currency is : " + exchangedAmount);;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "rsd=" + rsd +
                ", currency=" + currency +
                '}';
    }
}
