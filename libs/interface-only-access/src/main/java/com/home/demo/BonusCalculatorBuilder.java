package com.home.demo;
/*
* На этом месте может быть спринговый стартер который создает бины реализации интерфейсов
* */
public class BonusCalculatorBuilder {
    public GetBonus build() {
        return new Calculator();
    }
}
