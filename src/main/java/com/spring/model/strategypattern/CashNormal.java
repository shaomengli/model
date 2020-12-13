package com.spring.model.strategypattern;

/*
 * @description * 正常收费子类 :
 * @return
 * @author
 * @date        2020/12/13 20:28
 **/
public class CashNormal extends CashSuper{

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
