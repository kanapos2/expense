package csku.income;


public class MainIncome {
    public static void main(String[] args) {

        Income in = new Income(1000);

        System.out.println(in.getIncome());

        in.payMoney(1500);

        System.out.println(in.getDisbursement());

        System.out.println(in.getIncome());
    }
}
