package csku.income;

import java.util.ArrayList;
import java.util.Scanner;

public class Income {

    private int income ;
    private int disbursement;
    private int countMoney ;



    public Income(int income) {
        this.income = income ;
    }

    public int payMoney(int pay) {
        disbursement = pay ;
        if (income >= pay) {
            countMoney = income - pay ;
            income -= pay ;
            return countMoney ;
        }else {
            income = 0 ;
            return income ;
        }
    }

    public int addIncome(int number) {
        income += number ;
        return income ;
    }


    public int getIncome() {
        return income;
    }

    public int getCountMoney() {
        return countMoney;
    }

    public int getDisbursement() {
        return disbursement;
    }
}
