import java.util.Scanner;

public class PhoneBill
{
    static double fee;
    static  int extraMinute;
    static double tax;
    static  double extraFee;
    static double totalAmt;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phone Bill Generator");
        System.out.println("Enter the Phone bill amount : ");
        fee = scanner.nextDouble();
        System.out.println("enter the Extra Minutes ");
        extraMinute=scanner.nextInt();
        extraFee = findExtraFees(extraMinute);
        tax = findTax(fee,extraFee);
        totalAmt = findTotalAmount(fee,extraFee,tax);
        System.out.println("Phone bill is " + fee);
        System.out.println("Extra Minutes :"+extraMinute);
        System.out.println("Extra Charge :"+extraFee);
        System.out.println("Tax amount is  :"+tax);
        System.out.println("Total Amount is  "+totalAmt);
    }

    private static double findTotalAmount(double fee, double extraFee, double tax)
    {
        double finalAmount = fee + extraFee + tax;
        return finalAmount;
    }

    private static double findTax(double fee, double extraFee)
    {
        double billTax = (fee+extraFee)*15/100;
        return billTax;
    }

    public static double findExtraFees(int extraMinute)
    {
        double overFee = extraMinute * .25;
        return overFee;
    }
}
