import java.util.Scanner;

public class LaiSuat {

    public static void main(String[] args) {
        double money=1.0, interset_rate=1.0;
        int month;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();

        System.out.println("Enter number of months: ");
        month = sc.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = sc.nextDouble();

        double total_interset = money;
        for(int i = 0; i < month; i++){
            total_interset += total_interset * ((double)interset_rate/100)/12;
        }

        System.out.println("Total of interset: " + total_interset);
    }

}