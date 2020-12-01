package com.home.demo;

import com.google.gson.Gson;

public class Main {
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        GetBonus calculator = new Calculator();
        BonusWrapper bonus = calculator.getBonus(ClientType.NEW_CLIENT, 1);
        System.out.println(gson.toJson(bonus));
//        SayHello calculator = new Calculator();
    }
}
