package com.home.demo;

import com.google.gson.Gson;

public class Main {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
        GetBonus build = new BonusCalculatorBuilder().build();
        BonusWrapper bonus = build.getBonus(ClientType.NEW_CLIENT, 10);
        System.out.println(gson.toJson(bonus));

    }
}
