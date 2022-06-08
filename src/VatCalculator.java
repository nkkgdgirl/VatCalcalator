import java.util.Scanner;

public class VatCalculator
{
//    public int number1;
//    public int number2;
//    // สตาติกทำให้มันฟิกค่า num1/2 ทำให้อันนี้ไม่ต้องมี
//    private int number3;
//
//    public int getNumber1()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number1 : ");
//        number1 = sc.nextInt();
//        return number1;
//    }
//
//    public int getNumber2()
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number2 : ");
//        number2 = sc.nextInt();
//        return number2;

    public double vat = 7.0;
    public double price = 7.0;

    public double getPrice()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price : ");
        price = sc.nextDouble();
        return price;
    }

    public double CalculateVat(double price)
    {
        return price * vat/100;
    }

    public double CalculateTotal()
    {
        return price + CalculateVat(price);
    }
}