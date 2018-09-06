package csku.account;

import csku.income.Income;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestIncome {

    Income income ;

    @BeforeEach
    void init() {
        income = new Income(1000) ;
    }

    @Test
    public void testShowIncome() {
        assertEquals(1000 , income.getIncome());
    }

    @Test
    public void testShowDisbursement() {
        assertEquals(400 , income.getDisbursement());
    }

    @Test
    public void testPayMoneyLessThanIncome() {
        income.payMoney(400) ;
        assertEquals(600,income.getCountMoney());
    }


    @Test
    public void testPayMoneyGreaterThanIncome() {
        income.payMoney(1100) ;
        assertEquals(1100,income.getDisbursement());
        assertEquals(0,income.getCountMoney());
    }

    @Test
    public void testAddIncome() {
        income.addIncome(200);
        assertEquals(1200, income.getIncome());
    }


}
