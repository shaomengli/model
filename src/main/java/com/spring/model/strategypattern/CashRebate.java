package com.spring.model.strategypattern;

/*
 * @description * 打折消费子类 :
 * @return
 * @author
 * @date        2020/12/13 20:28
 **/
public class CashRebate extends CashSuper{
    private double moneyRebate=1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    public CashRebate() {
    }

    public double getMoneyRebate() {
        return moneyRebate;
    }

    public void setMoneyRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }

}
