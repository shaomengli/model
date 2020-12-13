package com.spring.model.strategypattern;

/*
 * @description * 返利收费子类:
 * @return
 * @author
 * @date        2020/12/13 20:29
 **/
public class CashReturn extends CashSuper{

    private double moneyCondition=0.0d;
    private double moneyReturn=0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result =money;
        if(money>=moneyCondition)
            result=money-(money/moneyCondition)*moneyReturn;
        return 0;
    }

    public double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }
}
