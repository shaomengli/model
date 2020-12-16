package com.spring.model.Strategy;

public class Program {
    public static void main(String[] args){
        Person xc=new Person("小菜");
        System.out.println("第一种装扮");
        Sneakers sneakers=new Sneakers();
        BigTrouser bigTrouser=new BigTrouser();
        TShirts tShirts=new TShirts();
        sneakers.setComponent(xc);
        bigTrouser.setComponent(sneakers);
        tShirts.setComponent(bigTrouser);
        tShirts.show();
    }
}
