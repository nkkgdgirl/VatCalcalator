public class Main {
    public static void main(String[] args)
    {
        VatCalculator calculate = new VatCalculator();
        calculate.getPrice();
        calculate.CalculateVat(calculate.price);
        calculate.CalculateTotal();
        System.out.println(calculate.CalculateVat(calculate.price));
        System.out.println(calculate.CalculateTotal());
    }

}


